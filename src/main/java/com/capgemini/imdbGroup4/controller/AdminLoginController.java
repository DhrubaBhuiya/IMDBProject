package com.capgemini.imdbGroup4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.service.AdminService;

@RestController
public class AdminLoginController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/admin-login", method=RequestMethod.POST)
	 public ModelAndView login(Model model,@ModelAttribute("id") String adminName, @ModelAttribute("password") String adminPassword,HttpServletRequest req)
	 {
		if(adminService.findByAdminNameAndAdminPassword(adminName,adminPassword)!=null) {
			HttpSession session=req.getSession();
 			String name=adminService.findByAdminNameAndAdminPassword(adminName, adminPassword).getAdminName();
 			session.setAttribute("admin_name", name);
			ModelAndView mv=new ModelAndView();
			mv.setViewName("admin-home");
			return mv;

		}
		else {
			ModelAndView mv = new ModelAndView();
		
			mv.addObject("error", "Invalid Details");
			mv.setViewName("admin-login");
			return mv;
		}
		
	 }
	
	@RequestMapping(value="/Adminlogout", method = RequestMethod.GET)
	public void logout(Model model, HttpServletRequest req, HttpServletResponse res )
	{	
		HttpSession session = req.getSession();
		session.removeAttribute("admin_name");
		RequestDispatcher rd = req.getRequestDispatcher("/admin");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}



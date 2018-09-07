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

import com.capgemini.imdbGroup4.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	
	private LoginService loginService;

	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public ModelAndView login(Model model,@ModelAttribute("id") String id, @ModelAttribute("password") String password, HttpServletRequest req) 
	 {
			 		
			 		if(loginService.findByUserIdAndPassword(id, password) != null) 
			       {
			 			ModelAndView mv = new ModelAndView(); 
			 			HttpSession session=req.getSession();
			 			String uname=loginService.findByUserIdAndPassword(id, password).getFirstName();
			 			session.setAttribute("name", uname);
			 			mv.setViewName("home");
			 			return mv;
			 		}
	 
			 		if(loginService.findByEmailIdAndPassword(id, password) != null) 
				       {
				 			ModelAndView mv = new ModelAndView(); 
				 			HttpSession session=req.getSession();
				 			String uname=loginService.findByEmailIdAndPassword(id, password).getFirstName();
				 			System.out.println(uname);
				 			session.setAttribute("name", uname);
				 			System.out.println(session.getAttribute("name"));
				 			mv.setViewName("home");
				 			return mv;
				 		}

			 		else {
						ModelAndView mv = new ModelAndView();
						mv.addObject("error", "Invalid Details");
						mv.setViewName("login");
						return mv;
					}
	    }
	 	@RequestMapping(value="/logout", method = RequestMethod.GET)
		public void logout(Model model, HttpServletRequest req, HttpServletResponse res )
		{	
			HttpSession session = req.getSession();
			session.removeAttribute("name");
			RequestDispatcher rd = req.getRequestDispatcher("/");
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

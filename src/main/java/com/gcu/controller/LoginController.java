package com.gcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private OrdersBusinessServiceInterface service;
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/login")
	public ModelAndView display(Model model) {
		ModelAndView mv = new ModelAndView();

		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());

		mv.addObject(model);
		mv.setViewName("login");
		return mv;
	}

	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		
		
		
		//navigate back to login view
		return "orders";

	}

}

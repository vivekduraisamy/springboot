package com.vivek.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivek.app.entity.Customer;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("home...");
		return "index";
	}

	@RequestMapping("add")
	public ModelAndView addCustomer(Customer customer) {
		System.out.println("add..");
		System.out.println(customer.toString());
		// Create a ModelAndView object to send response back
		ModelAndView mv = new ModelAndView();
		mv.addObject("customer", customer);
		mv.setViewName("displayCustomer");
		return mv;

	}

}

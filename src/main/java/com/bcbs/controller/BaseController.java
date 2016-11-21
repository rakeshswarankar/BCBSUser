package com.bcbs.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bcbs.model.User;

@Controller
@RequestMapping( value = "/")
public class BaseController {

	
	private static final String VIEW_WELCOME = "welcome";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	// For get the first request 
	@RequestMapping(  method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		System.out.println("welcome Get!");
		model.addAttribute("user", new User());
		
		logger.debug("[BaseController] index!");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}

	// Handle submitted user detail and response with Welcome page
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcomeName(@ModelAttribute("user") User user, ModelMap model) {

		System.out.println("welcome name "+user.getFirstName());
		model.addAttribute("user", user);
		
		logger.debug("[BaseController] welcome!");
		return VIEW_WELCOME;

	}

}

// I can improvise this solution or task using Validator and Exception handing and Binding Result
package com.cg.ctrl;


import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "user")
public class UserController {
	
	ArrayList<String> cityList;
	ArrayList<String> skillList;
	
	@RequestMapping(value ="showLogin")
	public String prepareLogin(Model model){
		System.out.println("In prepareLogin() method");
		model.addAttribute("login",new Login());
		return "login";
	}
	
	@RequestMapping(value = "checkLogin")
	public String checkLogin(){
		return "loginSuccess";
		
	}
	
	
	@RequestMapping(value ="showRegister")
	public String showRegister(User user,Model model){
		cityList = new ArrayList<String>();
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Banglore");
		cityList.add("Mumbai");
		
		skillList = new ArrayList<String>();
		skillList.add("Java");
		skillList.add("Struts");
		skillList.add("Spring");
		skillList.add("Hibernate");
		
		System.out.println("In prepareLogin() method");
		
		model.addAttribute("cityList",cityList);
		model.addAttribute("skilllist",skillList);
		
		model.addAttribute("user",user);
		return "register";
	}
	
	@RequestMapping(value = "checkRegister")
	public String checkRegister(@ModelAttribute("User")
	@Valid User user, BindingResult result, Model model)
	{
		if (result.hasErrors()) {
			System.out.println("Error");
			model.addAttribute("cityList",cityList);
			model.addAttribute("skilllist",skillList);
			return "register";
			
		}
		else{
			model.addAttribute("user",user);
			System.out.println("valid details");
			return "RegisterSuccess";
		}
	
	}
}

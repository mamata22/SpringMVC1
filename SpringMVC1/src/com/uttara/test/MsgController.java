package com.uttara.test;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uttara.test1.Msgservice;
import com.uttara.test3.RegBean;
@Controller
public class MsgController {

	
	@Autowired
	Msgservice service;
	public MsgController() {
		System.out.println("no arg constr");
	}
	@RequestMapping("/home")
	public String showhome()
	{
		return "Home";
	}
	@RequestMapping("/showjoke")
	public String showjoke(Model m)
	{
     String joke=service.getjoke();
     m.addAttribute("joke", joke);
		return "Displayjoke";
	}
	@RequestMapping("/openregisterview")
	public String showregister(Model model)
	{
		model.addAttribute("reg", new RegBean());
		return "Register";
	}
	@RequestMapping("/register")
	public String showreg(@ModelAttribute("reg")@Valid RegBean bean,Model m,BindingResult results)
	{
		if(results.hasErrors())
		return "Register";
		else
		{
			return "Success";
		}
	}
}

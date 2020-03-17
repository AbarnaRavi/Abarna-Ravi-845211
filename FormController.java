package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
	@RequestMapping(value="/CheckAccount",method=RequestMethod.POST)
	
	public String display(
	
		@RequestParam("user1")
         String	username,
		@RequestParam("pass")
		String pass1,
		Model m
		)
	{
		if(username.equals("thananya"))
		{
			String msg="Hello"+username;
			m.addAttribute("message",msg);
			return "successpage";
		}
		else
		{
			String msg="sorry!invalid"+username;
			m.addAttribute("message1",msg);
			return "errorpage";
		}
		
		}
		


}

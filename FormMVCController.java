package com.cts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/mainlogin")
public class FormMVCController {
	
	@RequestMapping("/callpage")
	public String disp(Model model)
	{
		FormBean res=new FormBean();
		Map<String,String>c1=new HashMap<String,String>();
		c1.put("US","UNITED States");
		c1.put("CH","China");
		c1.put("SG","Singapore");
		c1.put("MY","Malaysiya");
		//select option values sending to jsp
		model.addAttribute("countryopt",c1);
		model.addAttribute("result",res);
		return "FormLogin";
		}
	//@ModelAttribute-sending BEAN form values to jsp
	@RequestMapping("/valid")
	public String submitForm(
			@ModelAttribute("result12")
			FormBean res)
	{
		return "SuccessForm";
		
		
	}



}

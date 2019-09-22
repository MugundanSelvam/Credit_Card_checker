package com.mugu.codes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mugu.codes.entity.PanDetails;
import com.mugu.codes.service.CardService;



@Controller
public class CardController {
	
	@Autowired
	private CardService cs;
	
	@RequestMapping("/")
	public String displayLogin(Model model) {
		model.addAttribute("panModel",new PanDetails());
	    return "index"; 
	}
	
	@RequestMapping("/checkEligibility")
	public String showPage( @ModelAttribute("panModel") PanDetails panModel) {
				
		String x = panModel.getPanNo();
		int i = cs.checking(x);
		if(i==0)
		{
		    return "Eligible";
		}else if(i==1)
		{
			return "NotEligible";
		}else
		{
			return "Invalid";
		}
    }
	
	
	
}
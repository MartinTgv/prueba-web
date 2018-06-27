package com.tgv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tgv.pojo.Admin;
import org.tgv.pojo.Martin;


@Controller
public class MartinController {
	
	@RequestMapping("/martin")
	public String Administrador(Model model) {
		Martin martin = new Martin();
	model.addAttribute("martin", martin);
	return "martin";
	}

}

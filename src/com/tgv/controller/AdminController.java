/**
 * 
 */
package com.tgv.controller;

import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.tgv.pojo.Admin;

import com.tgv.service.AdminService;

/**
 * @author jperedo
 *
 */
@Controller
public class AdminController {
    @Autowired
	AdminService adminService;
	
    @RequestMapping("/admin")
	/*
	 * Model es una interface que usaremos para poder ingresar
	 * parametros, es valido solo para este metodo, no podremos enviar estos 
	 * a otro metodo, por ejemplo about
	 */
	public String Administrador(Model model, @ModelAttribute("resultado") String resultado) {
		List <Admin> admins = adminService.mostarTodos();
    	Admin admin = new Admin();
		model.addAttribute("admin", admin);
		//model.addAttribute("resultado", resultado);
		model.addAttribute("admins", admins);
		
		
		return "administrador";
	}
	
	@RequestMapping(value="/admin/save",method=RequestMethod.POST)
	public String handlAdmin(@ModelAttribute("admin") Admin adminForm, 
			Model model, RedirectAttributes ra){ 
		if(adminService.save(adminForm)) { 
			ra.addFlashAttribute("resultado","Cambios realizados correctamtente");
		} else {
			ra.addFlashAttribute("resultado","Error al guardar");
		}
		return "redirect:/admin" ; 
	}
}
		
		//}
	//{
	   
	//	System.out.println("Esto es lo que se guarda:"+ adminForm);
	//	ra.addFlashAttribute("resultado","Cambios realizados correctamtente");
		//return "redirect:/admin";
		//return "index";
	//}
//}

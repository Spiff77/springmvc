package com.thomas.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thomas.webapp.dao.LamaDaoJpa;
import com.thomas.webapp.model.Lama;

@Controller
public class HomeController {

	@Autowired
	LamaDaoJpa ldao;
	
	@GetMapping("/")
	public String index(@RequestParam(required = false) String name, Model model) {
		System.out.println(this.ldao.count());
		model.addAttribute("nom", name);
		return "home";
	}
	
	@GetMapping("/init")
	public String init() {

		return "redirect:/list";
	}
	
	@GetMapping("/list") 
	public String home(@RequestParam(required = false, defaultValue = "0") Integer init, Model model) {
		if(init == 1) {
			ldao.save(new Lama("serge"));
			ldao.save(new Lama("jacques"));
		}
		List<Lama> lamas = ldao.findAll();
		model.addAttribute("lamas", lamas);
		return "lamas/list";
	}
}
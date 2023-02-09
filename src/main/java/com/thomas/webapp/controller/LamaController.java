package com.thomas.webapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thomas.webapp.dao.LamaDaoJpa;
import com.thomas.webapp.model.Lama;

@Controller
@RequestMapping("/lamas")
public class LamaController {

	@Autowired
	private LamaDaoJpa ldao;
	
	
	@GetMapping("/{id}") 
	public String findOne(@PathVariable Long id, Model model) {
		Optional<Lama> lamaRes = this.ldao.findById(id);
		
		if(lamaRes.isPresent()) {
			model.addAttribute("lama", lamaRes.get());
			return "lamas/detail";
		}
		return "redirect:/lamas";
	}
	
	@GetMapping("") 
	public String findAll(@RequestParam(required = false, defaultValue = "0") Integer init, Model model) {
		if(init == 1) {
			ldao.save(new Lama("serge"));
			ldao.save(new Lama("jacques"));
		}
		
		List<Lama> lamas = ldao.findAll();
		model.addAttribute("lamas", lamas);
		return "lamas/list";
	}
	
	
}

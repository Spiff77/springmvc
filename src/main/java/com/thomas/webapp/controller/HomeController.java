package com.thomas.webapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{nom}/{lastname}")
	public String displayName(
			@PathVariable("nom") String lastname,
			@PathVariable String firstname,
			@RequestParam(required = false, defaultValue = "no color") String color, 
			@RequestParam(required = false, defaultValue = "no music :(") String music, 
			Model model) {
		model.addAttribute("nom", firstname + " "+lastname);
		model.addAttribute("color", color);
		model.addAttribute("music", music);
		
		return "home";
	}

	
}
/**
 * 
 * Faire un nouveau controller LamaController
 * --> /lamas ---> affiche la list de tous les nom de lamas, dispose en plus d'un
 * 	 				 parametre init pour peupler la base si vide
 * --> /lamas/{id} ---> Affiche un seul lama avec toutes ses propriétés (id, nom)
 * 						  (detail.jsp) 
 * 
 * Bonus, si id n'existe pas dans la base: Redirect--> /list
 * 
 * 
 * 
 */





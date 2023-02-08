package com.thomas.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thomas.webapp.dao.LamaDaoJpa;

@Controller
public class HomeController {

	@Autowired
	LamaDaoJpa ldao;
	
	@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String index() {
		System.out.println(this.ldao.count());
		return "redirect:/home";
	}
	

	@RequestMapping(path = {"/home"}, method = RequestMethod.GET)
	public String home() {
		return "home";
	}


}

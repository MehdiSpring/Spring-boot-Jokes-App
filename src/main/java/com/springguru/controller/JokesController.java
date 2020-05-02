package com.springguru.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springguru.service.JokesService;

@Controller
public class JokesController {
	
	private final JokesService jokesService;

	public JokesController(JokesService jokesService)
	{
		this.jokesService = jokesService;
	}
	
	@RequestMapping("/")
	public String getSomeJokes(Model model)
	{
		model.addAttribute("joke", this.jokesService.getSomejoke());
		return "chuckNorris";
	}
}

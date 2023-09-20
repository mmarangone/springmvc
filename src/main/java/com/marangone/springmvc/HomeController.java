package com.marangone.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.marangone.springmvc.model.Alien;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) 
	{
		
		m.addAttribute("result", repo.findAll());
		return "showAliens";
	}
	
	@GetMapping("getAlienById")
	public String getAlienById(@RequestParam int aid, Model m) {
		
		m.addAttribute("result",repo.getReferenceById(aid));
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m) {
		
		m.addAttribute("result",repo.findByName(aname));
		return "showAliens";
	}
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a){

		repo.save(a);
		
		return "result";
	}

}
	
	//Ejemplos de ADD
	/*
	 
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2")int j)
	{
		ModelAndView mv = new ModelAndView("result");
		mv.setViewName("result");
		int num3 = i + j;
		mv.addObject("num3", num3);
		
		return mv;	
	}
	
	@PostMapping(value="addAlien")
	public String addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, Model m){
		Alien a = new Alien(aid,aname);
		m.addAttribute("alien", a);
		
		return "result";
	}
	
	@RequestMapping("addAlienPro")
	public String addAlienPro(@ModelAttribute ("a1") Alien a){	
		
		return "result";
	} 
	 */
	 


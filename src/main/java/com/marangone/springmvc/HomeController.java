package com.marangone.springmvc;

import java.util.Arrays;
import java.util.List;

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
		List<Alien> aliens = Arrays.asList(new Alien(101,"Navin"), new Alien(102,"Rose"));
		m.addAttribute("result",aliens);
		return "showAliens";
	}
	
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
	
}

package com.uca.capas.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Student;
import com.uca.capas.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Manzana", "Tipo Gala importada", 1.00, false));
		products.add(new Product(2, "Pera", "Amarillas, tipo escolar", 1.20, true));
		products.add(new Product(3, "Uvas", "Verdes, precio libra", 1.35, false));
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message","JSTL Test");
		mav.addObject("productList", products);
		return mav;
	}
	
	/*@RequestMapping(value = "/formData", method = RequestMethod.POST)
	public ModelAndView formData(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "lname") String lname,
			@RequestParam(value = "bdate") String bDate,
			@RequestParam(value = "career") String career,
			@RequestParam(value = "experience") String experience) {
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setName(name);
		student.setLastName(lname);
		student.setbDate(bDate);
		student.setCareer(career);
		student.setExperience(experience);
		mav.setViewName("form");
		mav.addObject("student",student);
		return mav;
	}*/
}

package com.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String addProduct(Model model){
		return "products";
	}
}

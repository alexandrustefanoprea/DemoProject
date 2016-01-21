package com.menu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.menu.entity.Item;

@Controller
public class ProductsController {

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String addProduct(Model model,HttpSession session){
		
				
		Item item = new Item();
		item.setName("name");
		item.setPrice(10.4f);
		item.setType("tip");
		return "products";
	}
}

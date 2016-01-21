package com.menu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.menu.entity.Item;
import com.menu.services.ItemService;

@Controller
public class ProductsController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String addProduct(Model model,HttpSession session){
		
		
		
		Item item = new Item();
		item.setName("name");
		item.setPrice(10.4f);
		item.setType("tip");
		
		itemService.saveOrUpdate(item);
		
		return "products";
	}
}

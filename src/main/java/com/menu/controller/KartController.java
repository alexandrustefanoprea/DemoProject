package com.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KartController {
	
	@RequestMapping(value="/shopping-cart")
	public String getShoppingCart(){
		return "shopping-cart";
	}
}

package com.menu.services;

import com.menu.entity.Item;

public interface ItemService {

	Item saveOrUpdate(Item item);
	
	Item findItem(String name);
	
}

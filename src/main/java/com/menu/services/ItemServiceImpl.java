package com.menu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.entity.Item;
import com.menu.repository.ItemsRepository;

@Service("itemService")
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@Override
	public Item saveOrUpdate(Item item) {
		itemsRepository.createItem(item);
		return item;
	}

	@Override
	public Item findItem(String name) {
		return itemsRepository.findByName(name);
	}

}

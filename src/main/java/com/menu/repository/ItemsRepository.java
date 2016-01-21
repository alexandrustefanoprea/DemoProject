package com.menu.repository;

import com.menu.entity.Item;

public interface ItemsRepository {
	
	/**
	 * Stores/ updates an item in the repository.
	 * @param item {@Item}.
	 */
	void createItem(Item item);
	
	/**
	 * Queries the repository for a specific item by name or null if the item is not in the db.
	 * @param name {@String}
	 * @return {@Item}
	 */
	Item findByName(String name);
}

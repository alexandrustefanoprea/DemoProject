package com.menu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.menu.entity.Item;

@Repository("itemRepository")
public class ItemsRepositoryImpl implements ItemsRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void createItem(Item item) {
		if (item.getId() ==null){
		em.persist(item);
		em.flush();
		} else{
			em.merge(item);
		}
	}

	@Override
	public Item findByName(String name) {
		Item item = em.createQuery("SELECT i FROM item i where i.name LIKE :prodName",Item.class).setParameter("prodName", name)
				.getSingleResult();
		return item;
	}

}

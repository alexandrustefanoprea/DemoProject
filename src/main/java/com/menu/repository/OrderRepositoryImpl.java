package com.menu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.menu.entity.Order;

@Repository("orderRepository")
public class OrderRepositoryImpl implements OrderRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void storeOrder(Order order) {
		if (order.getId()==null){
			em.persist(order);
			em.flush();
		} else{
			em.merge(order);
		}
	}
	
}

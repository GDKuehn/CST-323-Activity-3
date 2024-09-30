/**
 * 
 */
package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @author Gavin Kuehn
 *
 */
public class OrdersBusinessService implements OrdersBusinessServiceInterface {
	@Autowired
	public DataAccessInterface<OrderModel> service;
	/**
	 * 
	 */
	public OrdersBusinessService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<OrderModel> getOrders() {
		
		return service.findAll();
	}


	@Override
	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Initialize method in OrdersBusinessService class");

	}


	@Override
	@PreDestroy
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method in OrdersBusinessService class");
	}

}

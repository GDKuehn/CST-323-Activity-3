package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	public AnotherOrdersBusinessService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "000000010", "New Product 10", 10.00f, 10));
		orders.add(new OrderModel(1L, "000000020", "New Product 20", 20.00f, 20));
		orders.add(new OrderModel(2L, "000000030", "Old Product 30", 30.00f, 30));
		orders.add(new OrderModel(3L, "000000040", "Product 40", 40.00f, 40));
		orders.add(new OrderModel(4L, "000000040", "Product 50", 50.00f, 50));
		
		return orders;
	}
	
	
	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Initialize method in AnotherOrdersBusinessService class");

	}



	@PreDestroy
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method in AnotherOrdersBusinessService class");
	}

}

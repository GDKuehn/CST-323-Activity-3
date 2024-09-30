package com.gcu.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="orders")
public class OrderList {
	
	private List<OrderModel> orders = new ArrayList<OrderModel>();

	
	public OrderList() {
		// TODO Auto-generated constructor stub
	}


	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;
	}

    @XmlElement(name="orders")
	public List<OrderModel> getOrders() {
		return orders;
	}

}

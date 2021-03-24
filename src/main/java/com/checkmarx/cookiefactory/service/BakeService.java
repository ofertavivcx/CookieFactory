package com.checkmarx.cookiefactory.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.checkmarx.cookiefactory.OrderRepository;
import com.checkmarx.cookiefactory.model.Order;

@Service
public class BakeService {
	@Autowired
	private OrderRepository orderRepository;
	
	Map<Long, Integer> cookiesForOrders = new HashMap<>();
	int cookiesReady = 0;
	
	public BakeService() {
		
	}
	
	@Scheduled(fixedRate = 5000)
	public void bakeCookie() {
		cookiesReady++;
	}

	public int getCookiesReady() {
		return cookiesReady;
	}
	
	public String takeCookies(int amount) {
		if (cookiesReady >= amount) {
			cookiesReady -= amount;
    		return generateOrder(amount).toString();
		}
		return "not enough cookies";
	}

	public String bakeCookies(int amount) {
		Order order = generateOrder(amount);
		cookiesForOrders.put(order.getId(), 0);
		bakeCookiesForOrder(order.getId(), amount);
		// TODO Auto-generated method stub
		return order.toString();
	}
	
	@Scheduled(fixedRate = 3000)
	private void bakeCookiesForOrder(long id, int amount) {
		cookiesForOrders.put(id, cookiesForOrders.get(id) + 1);
		if (cookiesForOrders.get(id) >= amount) {
			// TODO - terminate scheduled job
		}
	}

	private Order generateOrder(int amount) {
		Order order = new Order();
		order.setAmount(amount);
		order = orderRepository.save(order);
		return order;
	}

}

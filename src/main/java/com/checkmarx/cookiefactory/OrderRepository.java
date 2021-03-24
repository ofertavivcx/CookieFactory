package com.checkmarx.cookiefactory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkmarx.cookiefactory.model.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}

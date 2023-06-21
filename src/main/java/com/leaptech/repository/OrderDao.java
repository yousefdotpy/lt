package com.leaptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaptech.model.OrderDetails;

@Repository
public interface OrderDao extends JpaRepository<OrderDetails, Integer> {

}

package com.leaptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaptech.model.Bill;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

}

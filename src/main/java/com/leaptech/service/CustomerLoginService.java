package com.leaptech.service;

import org.springframework.stereotype.Service;

import com.leaptech.exception.CustomerLoginException;
import com.leaptech.model.CustomerLoginDTO;

@Service
public interface CustomerLoginService {
	public String customerLogin(CustomerLoginDTO dto) throws CustomerLoginException;
	
	public String customerLogout(String uniqueId) throws CustomerLoginException;
}

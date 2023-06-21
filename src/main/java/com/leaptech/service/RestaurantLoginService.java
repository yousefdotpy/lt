package com.leaptech.service;

import org.springframework.stereotype.Service;

import com.leaptech.exception.RestaurantLoginException;
import com.leaptech.model.RestaurantLoginDTO;

@Service
public interface RestaurantLoginService {
	public String restaurantLogin(RestaurantLoginDTO dto) throws RestaurantLoginException;

    public String restaurantLogout(String uniqueId) throws RestaurantLoginException;
}

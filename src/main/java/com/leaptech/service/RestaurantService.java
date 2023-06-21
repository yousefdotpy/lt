package com.leaptech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leaptech.exception.RestaurantException;
import com.leaptech.model.Restaurants;

@Service
public interface RestaurantService {

	public Restaurants createRestaurant(Restaurants restaurants) throws RestaurantException;

	public Restaurants updateRestaurant(String uniqueId,Restaurants restaurants) throws RestaurantException;

	public Restaurants removeRestaurant(Integer resturantid) throws RestaurantException;

	public List<Restaurants> viewRestaurant(String uniqueId) throws RestaurantException;

	public List<Restaurants> viewNearByRestaurant(String location) throws RestaurantException;

	public List<Restaurants> viewRestaurantByItemname(String itemname) throws RestaurantException;

	//////////////////////////////////////////////////////////////////////////////////////
	public Restaurants addRestaurant(Restaurants restaurants) throws RestaurantException;

}

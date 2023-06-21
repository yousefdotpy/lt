package com.leaptech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaptech.model.Bill;
import com.leaptech.service.BillService;

@RestController
public class BillController
{

	@Autowired
	public BillService bService;

	@PostMapping("/addBill/{orderId}/{uniqueId}")
	public ResponseEntity<Bill> addBill(@PathVariable("orderId") Integer orderId,
			@PathVariable("uniqueId") String uniqueId)
	{

		Bill savedBill = bService.addBill(orderId, uniqueId);

		return new ResponseEntity<Bill>(savedBill, HttpStatus.CREATED);

	}

//	@PutMapping("/removeBill")
//	public ResponseEntity<Bill> removeBill(@Valid @RequestBody Bill bill) throws BillException
//	{
//
//		Bill removedBill = bService.removeBill(bill);
//
//		return new ResponseEntity<Bill>(removedBill, HttpStatus.ACCEPTED);
//
//	}

}

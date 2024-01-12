package com.project.customer_register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customer_register.model.CustomerAddress;
import com.project.customer_register.service.CustomerAddressService;

@RestController
@RequestMapping("/customer_address")
public class CustomerAddressController {
	@Autowired
	CustomerAddressService addressService;
	
	@PostMapping
	public String addCustomerAddress(@RequestBody List<CustomerAddress> addresses) {
		return addressService.addCustomerAddress(addresses);
//		return null;
	}
}

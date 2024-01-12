package com.project.customer_register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.customer_register.model.CustomerRegister;
import com.project.customer_register.service.CustomerRegisterService;

@RestController
@RequestMapping("/customer_register")
public class CustomerRegisterController {
	@Autowired
	CustomerRegisterService customerRegisterService;
	
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public String customerRegister(@RequestBody CustomerRegister customerRegister) {
		return customerRegisterService.registerCustomer(customerRegister);
	}
	
	
	@GetMapping
	public List<CustomerRegister> getRegisteredCustomers(){
		return customerRegisterService.getRegisteredCustomers();
	}
	
	@GetMapping("/{customerId}")
    public CustomerRegister getCustomerById(@PathVariable Integer customerId) {
        return customerRegisterService.getCustomerById(customerId);
    }

}

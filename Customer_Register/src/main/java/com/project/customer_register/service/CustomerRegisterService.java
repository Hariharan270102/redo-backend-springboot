package com.project.customer_register.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.customer_register.model.CustomerAddress;
import com.project.customer_register.model.CustomerRegister;
import com.project.customer_register.repo.CustomerAddressRepository;
import com.project.customer_register.repo.CustomerRegisterRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CustomerRegisterService {
	private final CustomerRegisterRepository customerRegisterRepository;
	private final CustomerAddressRepository addressRepository;
	@Transactional
    public String registerCustomer(CustomerRegister customerRegister) {
        try {
        	 // Save CustomerAddress entities first
            for (CustomerAddress address : customerRegister.getCust_address()) {
                addressRepository.save(address);
            }
        	
            customerRegisterRepository.save(customerRegister);
            return "Success";
        } catch (Exception e) {
            // Log the exception details
            e.printStackTrace(); // or use a logging framework
            return "Error: Unable to register customer";
        }
    }
	public List<CustomerRegister> getRegisteredCustomers() {
		// TODO Auto-generated method stub
		return customerRegisterRepository.findAll();
//		return null;
	}
	  public CustomerRegister getCustomerById(Integer customerId) {
	        return customerRegisterRepository.findById(customerId)
	                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + customerId));
	    }

}

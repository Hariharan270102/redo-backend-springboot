package com.project.customer_register.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.customer_register.model.CustomerAddress;
import com.project.customer_register.repo.CustomerAddressRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerAddressService {
	private final CustomerAddressRepository addressRepository;

	public String addCustomerAddress(List<CustomerAddress> addresses) {

			for(CustomerAddress address:addresses) {
				addressRepository.save(address);
							
			}
			return "success";

		
		// TODO Auto-generated method stub
		
	}
	

}

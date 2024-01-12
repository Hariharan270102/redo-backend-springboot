package com.project.customer_register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customer_register.model.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {

}

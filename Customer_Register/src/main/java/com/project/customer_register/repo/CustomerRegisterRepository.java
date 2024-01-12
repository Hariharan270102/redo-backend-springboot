package com.project.customer_register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customer_register.model.CustomerRegister;

public interface CustomerRegisterRepository extends JpaRepository<CustomerRegister, Integer> {

}

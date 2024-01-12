package com.project.customer_register.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
public class CustomerRegister {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int cust_id;
	private String cust_name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<CustomerAddress> cust_address;


}

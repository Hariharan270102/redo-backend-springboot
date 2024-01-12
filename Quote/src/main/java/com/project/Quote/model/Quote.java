package com.project.Quote.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.project.customer_register.model.CustomerAddress;
import com.project.customer_register.model.CustomerRegister;

@Data
@Entity
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String quote_id;
	private String quote_name;
	private String quote_owner;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerRegister customer;
	@ManyToAny
	private List<CustomerAddress> quote_address;
}
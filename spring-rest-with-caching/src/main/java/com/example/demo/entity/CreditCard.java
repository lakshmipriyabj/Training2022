package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="lp_creditcard_cache")
public class CreditCard {
	
	@Id
	@Column(name="card_number")
	private long cardNumber;
	
	@Column(name="card_holder_name")
	private String cardHolderName;
	
	
	@Column(name="credit_limit")
	private double creditLimit;

}

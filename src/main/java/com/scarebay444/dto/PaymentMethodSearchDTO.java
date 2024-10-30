package com.scarebay444.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PaymentMethodSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer paymentMethodId;
	
	private String cardNumber;
	
	private Date expiryDate;
	
	private String cardHolderName;
	
}

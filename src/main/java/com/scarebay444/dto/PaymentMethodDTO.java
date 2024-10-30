package com.scarebay444.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class PaymentMethodDTO {

	private Integer paymentMethodId;

	private String cardNumber;

	private Date expiryDate;

	private String cardHolderName;






}

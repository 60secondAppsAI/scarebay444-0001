package com.scarebay444.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.scarebay444.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.scarebay444.domain.PaymentMethod;
import com.scarebay444.dto.PaymentMethodDTO;
import com.scarebay444.dto.PaymentMethodSearchDTO;
import com.scarebay444.dto.PaymentMethodPageDTO;
import com.scarebay444.service.PaymentMethodService;
import com.scarebay444.dto.common.RequestDTO;
import com.scarebay444.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/paymentMethod")
@RestController
public class PaymentMethodController {

	private final static Logger logger = LoggerFactory.getLogger(PaymentMethodController.class);

	@Autowired
	PaymentMethodService paymentMethodService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<PaymentMethod> getAll() {

		List<PaymentMethod> paymentMethods = paymentMethodService.findAll();
		
		return paymentMethods;	
	}

	@GetMapping(value = "/{paymentMethodId}")
	@ResponseBody
	public PaymentMethodDTO getPaymentMethod(@PathVariable Integer paymentMethodId) {
		
		return (paymentMethodService.getPaymentMethodDTOById(paymentMethodId));
	}

 	@RequestMapping(value = "/addPaymentMethod", method = RequestMethod.POST)
	public ResponseEntity<?> addPaymentMethod(@RequestBody PaymentMethodDTO paymentMethodDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = paymentMethodService.addPaymentMethod(paymentMethodDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/paymentMethods")
	public ResponseEntity<PaymentMethodPageDTO> getPaymentMethods(PaymentMethodSearchDTO paymentMethodSearchDTO) {
 
		return paymentMethodService.getPaymentMethods(paymentMethodSearchDTO);
	}	

	@RequestMapping(value = "/updatePaymentMethod", method = RequestMethod.POST)
	public ResponseEntity<?> updatePaymentMethod(@RequestBody PaymentMethodDTO paymentMethodDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = paymentMethodService.updatePaymentMethod(paymentMethodDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}

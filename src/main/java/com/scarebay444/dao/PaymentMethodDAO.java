package com.scarebay444.dao;

import java.util.List;

import com.scarebay444.dao.GenericDAO;
import com.scarebay444.domain.PaymentMethod;





public interface PaymentMethodDAO extends GenericDAO<PaymentMethod, Integer> {
  
	List<PaymentMethod> findAll();
	






}



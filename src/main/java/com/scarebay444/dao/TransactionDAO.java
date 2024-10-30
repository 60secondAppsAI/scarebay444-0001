package com.scarebay444.dao;

import java.util.List;

import com.scarebay444.dao.GenericDAO;
import com.scarebay444.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}



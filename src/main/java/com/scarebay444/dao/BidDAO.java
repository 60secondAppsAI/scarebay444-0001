package com.scarebay444.dao;

import java.util.List;

import com.scarebay444.dao.GenericDAO;
import com.scarebay444.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}



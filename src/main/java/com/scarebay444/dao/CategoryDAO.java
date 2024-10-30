package com.scarebay444.dao;

import java.util.List;

import com.scarebay444.dao.GenericDAO;
import com.scarebay444.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}



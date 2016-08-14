package com.nikolayarkhipov.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserUpdateDao extends PagingAndSortingRepository<UserUpdate, Integer> {
	UserUpdate findFirstByOrderByAddedDesc();
	//UserUpdate findByName(String name);
	//ArrayList<UserUpdate> findAll(String name);

	List<UserUpdate> findByName(String name);

}

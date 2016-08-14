package com.nikolayarkhipov.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nikolayarkhipov.model.UserUpdate;
import com.nikolayarkhipov.model.UserUpdateDao;




@Service
public class UserUpdateService {
	private final static int PAGESIZE = 10;

	@Autowired
	private UserUpdateDao userUpdateDao;
	
	public void save(UserUpdate userUpdate) {
		userUpdateDao.save(userUpdate);
	}
	
	public UserUpdate getLatest() {
		return userUpdateDao.findFirstByOrderByAddedDesc();
	}
	
	//public UserUpdate getByName(String name) {
		//return userUpdateDao.findByName(name);
	//}
	
	public Page<UserUpdate> getPage(int pageNumber) {
		PageRequest request = new PageRequest(pageNumber-1, PAGESIZE, Sort.Direction.DESC, "added");
		
		return userUpdateDao.findAll(request);
	}

	public void delete(Integer id) {
		userUpdateDao.delete(id);
	}

	public UserUpdate get(Integer id) {
		return userUpdateDao.findOne(id);
	}
	
	public List<UserUpdate> findAll(String name) {
	    return userUpdateDao.findByName(name);
	}
	
	/*public ArrayList<UserUpdate> getUser(String name) {
		//PageRequest request = new PageRequest(pageNumber-1, PAGESIZE, Sort.Direction.DESC, "added");
		
		return userUpdateDao.findAll(name);
	}*/
}



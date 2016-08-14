package com.nikolayarkhipov.tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nikolayarkhipov.App;
import com.nikolayarkhipov.model.UserUpdate;
import com.nikolayarkhipov.model.UserUpdateDao;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebAppConfiguration
@Transactional
public class StatusTest {
	
	@Autowired
	private UserUpdateDao userUpdateDao;

	@Test
	public void testSave() {
		
		
		UserUpdate status = new UserUpdate();
		
		userUpdateDao.save(status);
	}
	
	
}
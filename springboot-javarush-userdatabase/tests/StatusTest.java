package com.nikolayarkhipov.tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
public class StatusTest {
	
	Date myDate = new Date();
	
	@Autowired
	private UserUpdateDao userUpdateDao;

	@Test
	public void testSave() {
		
		
		UserUpdate user = new UserUpdate(101,"Mikhail", 35, false, myDate);
		UserUpdate user1 = new UserUpdate(102,"Inessa", 35, true, myDate);
		UserUpdate user2 = new UserUpdate(103,"Mikhail", 33, true, myDate);
		UserUpdate user3 = new UserUpdate(104,"Inessa", 23, false, myDate);
		UserUpdate user4 = new UserUpdate(105,"Lisa", 35, true, myDate);
		UserUpdate user5 = new UserUpdate(106,"Lisa", 13, false, myDate);
		UserUpdate user6 = new UserUpdate(107,"Peter", 35, true, myDate);
		UserUpdate user7 = new UserUpdate(108,"Mike", 12, false, myDate);
		UserUpdate user8 = new UserUpdate(109,"Lesly", 22, true, myDate);
		UserUpdate user9 = new UserUpdate(110,"Dima", 55, false, myDate);
		UserUpdate user10 = new UserUpdate(111,"Sasha", 45, false, myDate);
		UserUpdate user11 = new UserUpdate(112,"Sasha", 35, true, myDate);
		UserUpdate user12 = new UserUpdate(113,"Yana", 37, false, myDate);
		UserUpdate user13 = new UserUpdate(114,"Maria", 22, false, myDate);
		UserUpdate user14 = new UserUpdate(115,"Ekaterina", 92, false, myDate);
		UserUpdate user15 = new UserUpdate(116,"Paul", 35, false, myDate);
		UserUpdate user16 = new UserUpdate(117,"Harry", 67, false, myDate);
		UserUpdate user17 = new UserUpdate(118,"Ron", 44, false, myDate);
		UserUpdate user18 = new UserUpdate(119,"Tamara", 35, true, myDate);
		UserUpdate user19 = new UserUpdate(120,"Tyson", 33, false, myDate);
		UserUpdate user20 = new UserUpdate(121,"Lory", 35, true, myDate);
		UserUpdate user21 = new UserUpdate(122,"Billy", 35, false, myDate);
		UserUpdate user22 = new UserUpdate(123,"Eva", 35, false, myDate);
		UserUpdate user23 = new UserUpdate(124,"Chuck", 22, false, myDate);
		UserUpdate user24 = new UserUpdate(125,"Selena", 33, true, myDate);
		UserUpdate user25 = new UserUpdate(126,"Venera", 35, false, myDate);
		UserUpdate user26 = new UserUpdate(127,"Brian", 44, false, myDate);
		UserUpdate user27 = new UserUpdate(128,"Vasily", 65, true, myDate);
		UserUpdate user28 = new UserUpdate(129,"Leonid", 46, false, myDate);
		UserUpdate user29 = new UserUpdate(130,"Charlie", 21, true, myDate);
		UserUpdate user30 = new UserUpdate(131,"Ivan", 76, false, myDate);
		UserUpdate user31 = new UserUpdate(132,"Garry", 47, false, myDate);

		userUpdateDao.save(user);
		userUpdateDao.save(user2);
		userUpdateDao.save(user1);
		userUpdateDao.save(user3);
		userUpdateDao.save(user4);
		userUpdateDao.save(user6);
		userUpdateDao.save(user5);
		userUpdateDao.save(user7);
		userUpdateDao.save(user8);
		userUpdateDao.save(user9);
		userUpdateDao.save(user10);
		userUpdateDao.save(user11);
		userUpdateDao.save(user12);
		userUpdateDao.save(user13);
		userUpdateDao.save(user14);
		userUpdateDao.save(user15);
		userUpdateDao.save(user16);
		userUpdateDao.save(user17);
		userUpdateDao.save(user18);
		userUpdateDao.save(user19);
		userUpdateDao.save(user20);
		userUpdateDao.save(user21);
		userUpdateDao.save(user22);
		userUpdateDao.save(user23);
		userUpdateDao.save(user24);
		userUpdateDao.save(user25);
		userUpdateDao.save(user26);
		userUpdateDao.save(user27);
		userUpdateDao.save(user29);
		userUpdateDao.save(user28);
		userUpdateDao.save(user30);
		userUpdateDao.save(user31);

	}
	
	
}
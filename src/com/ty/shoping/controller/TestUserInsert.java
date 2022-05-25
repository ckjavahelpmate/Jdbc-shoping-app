package com.ty.shoping.controller;

import com.ty.shoping.dao.UserDao;
import com.ty.shoping.dto.User;

public class TestUserInsert {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("Smith");
		user.setEmail("Smith@mail.com");
		user.setPassword("Smith123");
		user.setMobile(9071864676l);
		
		UserDao dao = new UserDao();
		int res = dao.saveUser(user);
		
		if( res != 0 ) {
			System.out.println("Data is inerted");
		}
		else {
			System.out.println("No Data is inerted");
		}
		

	}

}

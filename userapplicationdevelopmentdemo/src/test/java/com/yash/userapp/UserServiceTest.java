package com.yash.userapp;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.yash.userapp.daoimpl.UserDaoImpl;
import com.yash.userapp.pojo.User;
import com.yash.userapp.serviceimpl.UserServiceImpl;


public class UserServiceTest {

	@Mock
	private UserDaoImpl userdao;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test_addUser_method_with_user_object_called_once() {
		User user = new User();
		userService.addUser(user);
		verify(userdao,times(1)).insertUser(user);
	}
}


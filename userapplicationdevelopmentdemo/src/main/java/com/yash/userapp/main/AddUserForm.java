package com.yash.userapp.main;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.yash.userapp.controller.UserController;

public class AddUserForm {

	public static void main(String[] args) {

	    final Logger logger = Logger.getLogger(AddUserForm.class);
		String name=JOptionPane.showInputDialog("Enter your name");
		double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
		logger.info(name);
		logger.info(salary);
		UserController userController=new UserController();
		userController.prepareAndSaveUser(name, salary);

	}

}

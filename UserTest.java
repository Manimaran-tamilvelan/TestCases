package com.fullcreative.login.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.fullcreative.login.User;

public class UserTest {
	
	@Test
	public void testUserClass() {
		User addUser = new User("Demo", "Demo@123", "demo@gmail.com", "01-15-1999", "9514437710");
		//System.out.println(addUser.toString());
		
		String expected = "User [userName=Demo, password=Demo@123, mailID=demo@gmail.com, dOB=01-15-1999, mobileNo=9514437710]";
		assertEquals(expected, addUser.toString());
	}
	
	@Test
	public void test() {
		User addUser = new User("----", "Demo@123", "demo@gmail.com", "01-15-1999", "9514437710");
		//System.out.println(addUser.toString());
		
		String expected = "User [userName=Demo, password=Demo@123, mailID=demo@gmail.com, dOB=01-15-1999, mobileNo=9514437710]";
		assertNotEquals(expected, addUser.toString());
		
	}

}

package com.fullcreative.login.test;

import static org.junit.Assert.assertArrayEquals;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.annotations.Discriminator;

import org.junit.*;

import com.fullcreative.login.Delete;
import com.fullcreative.login.PMF;
import com.fullcreative.login.User;

public class DeleteTest {

	@Test
	public void Test() {
		
		Delete d = new Delete();
		String userName = "Demo";
		String password = "demo@123";
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		String query = "userName == '" + userName + "' && password == '" + password + "'";
		Query q = pm.newQuery(User.class, query);
		
		if(q.execute().toString().equals("[]")) {
			System.out.println("User not exits");
		}
		
		d.deleteUser(userName, password);
		String user = q.execute().toString();
		Assert.assertEquals("[]", user);
	}

}

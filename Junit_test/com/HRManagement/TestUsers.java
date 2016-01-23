package com.HRManagement;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUsers {
	
	private UserController user = null;
	
	@Before
	public void setUp() throws Exception {
		this.user = new UserController();
	}

	@Test
	public void testUser1() {
		assertTrue(user.checkUser("philippos","1234"));
	}
	
	@Test
	public void testUser2() {
		assertFalse(user.checkUser("qgasdfsdf","12345"));
	}
	
	@Test
	public void testPermissions1() {
		assertEquals(user.getPermission("alkis"),"Proistamenos");
	}
	
	@Test
	public void testPermissions2() {
		assertNotSame(user.getPermission("pasas2"),"HR");
	}

}

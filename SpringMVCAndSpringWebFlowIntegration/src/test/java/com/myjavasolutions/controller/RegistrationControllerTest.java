package com.myjavasolutions.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegistrationControllerTest {

	private RegistrationController registrationController;
	@Before
	public void setUp() {
		registrationController = new RegistrationController();
	}
	@Test
	public void registerUser() {
		assertEquals("thankyou", registrationController.registerUser());
	}
	
	@Test
	public void home() {
		assertEquals("home", registrationController.home());
	}
}

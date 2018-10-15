package com.technocredits.orangHRM.testScript;

import org.testng.annotations.Test;

public class LoginTest extends CommanTest {

	@Test
	public void loginCheck(){
	
		login("Admin", "admin123");
	}
}

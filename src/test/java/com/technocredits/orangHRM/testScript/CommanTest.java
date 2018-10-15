package com.technocredits.orangHRM.testScript;

import com.technocredits.orangHRM.pages.LoginPage;

public class CommanTest {

	public void login(String username, String password){
		LoginPage loginInstance = LoginPage.getInstance();
		loginInstance.enterValueForLoginPage("usernameTextFiled",username);
		loginInstance.enterValueForLoginPage("passwordTextFiled",password);
		loginInstance.clickOnLoginPage("loginbutton");
	}
}

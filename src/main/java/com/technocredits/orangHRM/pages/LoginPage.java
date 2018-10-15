package com.technocredits.orangHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRM.base.predefinedMethods;
import com.technocredits.orangeHRM.util.PropertyFileReader;

public class LoginPage extends predefinedMethods{
	
	private static LoginPage loginpageInstance;
	
	Properties loginpageProperties;
	
	private LoginPage(){
		initialization();
		PropertyFileReader propReader = new PropertyFileReader();
		loginpageProperties =  propReader.initializePropertyFile("loginpageProperties");
	}

	public static LoginPage getInstance(){
		if(loginpageInstance==null){
			loginpageInstance = new LoginPage();
		}
		return loginpageInstance;
	}
	
	public void enterValueForLoginPage(String locater, String value){
		setText(loginpageProperties.getProperty(locater),value);
		
	}
	
	public void clickOnLoginPage(String locater){
		click(loginpageProperties.getProperty(locater));
	}
}

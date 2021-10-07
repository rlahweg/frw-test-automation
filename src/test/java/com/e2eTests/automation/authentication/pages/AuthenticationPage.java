package com.e2eTests.automation.authentication.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {
	
	/*Locators*/
	final static String USERNAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN = "btnLogin";
	final static String MESSAGE_TO_WELCOME = "Welcome";
	/*@FindBy*/
	@FindBy(how=How.ID, using=USERNAME_ID)
	public static WebElement userName;
	@FindBy(how=How.ID, using=PASSWORD_ID)
	public static WebElement password;
	@FindBy(how=How.ID, using=BUTTON_LOGIN)
	public static WebElement btnLogin;
	@FindBy(how=How.ID, using=MESSAGE_TO_WELCOME)
	public static WebElement welcome;
	
	/*Methods*/
	public void fillUsername(String username) {
		userName.sendKeys(username);
	}
	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}
	public void clickLoginButton() {
		btnLogin.click();
	}
}

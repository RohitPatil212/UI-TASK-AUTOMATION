package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	private WebElement Username;

	

	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement Password;
	
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement LoginButton;


	
	public WebElement getUsername() {
		return Username;
	}



	public WebElement getPassword() {
		return Password;
	}


	


	public WebElement getLoginButton() {
		return LoginButton;
	}


	
	
}

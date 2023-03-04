package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PIM_PagePom {
	
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement Add_Employee;

	
	@FindBy(how=How.XPATH,using ="//input[@name='firstName']")
	private WebElement First_name;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='middleName']")
	private WebElement Middle_name;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement Last_name;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement Emp_id;
	
	@FindBy (how=How.XPATH,using="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement Login_Details;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	private WebElement Create_username;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label")
	private WebElement Status_Enabled;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label")
	private WebElement Disabled;
	
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement Save;


	public WebElement getAdd_Employee() {
		return Add_Employee;
	}



	public WebElement getFirst_name() {
		return First_name;
	}




	public WebElement getMiddle_name() {
		return Middle_name;
	}


	


	public WebElement getLast_name() {
		return Last_name;
	}


	


	public WebElement getEmp_id() {
		return Emp_id;
	}


	


	public WebElement getLogin_Details() {
		return Login_Details;
	}


	


	public WebElement getCreate_username() {
		return Create_username;
	}


	

	public WebElement getStatus_Enabled() {
		return Status_Enabled;
	}


	


	public WebElement getDisabled() {
		return Disabled;
	}


	

	public WebElement getSave() {
		return Save;
	}


	
}

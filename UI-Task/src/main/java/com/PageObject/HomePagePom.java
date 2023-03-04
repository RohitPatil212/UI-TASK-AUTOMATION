package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public 
class HomePagePom {
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	
	private WebElement PIM_tab;
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Directory']")
	private WebElement directory;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type for hints...']")
	private WebElement Enter_name;
	
	@FindBy(how=How.XPATH,using="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement Search_btn;

	public WebElement getPIM_tab() {
		return PIM_tab;
	}

	
	public WebElement getdirectory() {
		return directory;
	}
	
	
	public WebElement getEnter_name() {
		return Enter_name;
	}
	
	public WebElement getSearch_btn() {
		return Search_btn;
	}
	
}

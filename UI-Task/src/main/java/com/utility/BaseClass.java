package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.PageObject.LoginPom;
import com.PageObject.PIM_PagePom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver ;
	@BeforeMethod
	public void SetUp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//driver.navigate().refresh();
		//Thread.sleep(4000);

	}		
	
	
	@AfterMethod
	public void tearDown() {
	driver.close();
	} 
	
}
	


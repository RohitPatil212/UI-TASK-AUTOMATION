package Com.Test;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.PageObject.LoginPom;
import com.PageObject.PIM_PagePom;
import com.utility.BaseClass;

public class Test_tc_001 extends BaseClass {
	

	
	@Test
	
	public void verify_Login_validCredential() throws Exception {
		
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		login.getUsername().sendKeys("Admin");
		login.getPassword().sendKeys("admin123");
		login.getLoginButton().click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		HomePagePom Home = PageFactory.initElements(driver, HomePagePom.class);

		
		Home.getPIM_tab().click();
		
		
		PIM_PagePom PIM = PageFactory.initElements(driver, PIM_PagePom.class);

		PIM.getAdd_Employee().click();
		
		PIM.getFirst_name().sendKeys("Ronaldo");
		
		
		PIM.getMiddle_name().sendKeys("christiano");
		
		
		PIM.getLast_name().sendKeys("-");
		
		
		PIM.getEmp_id().sendKeys("1233");
		
		PIM.getLogin_Details().isSelected();
		
		
		PIM.getSave().click();
		
		Home.getdirectory().click();
		Home.getEnter_name().sendKeys("Ronaldo christiano -");
		
		
		
		
		
	}
}
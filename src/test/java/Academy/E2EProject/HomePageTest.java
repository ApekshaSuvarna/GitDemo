package Academy.E2EProject;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import jdk.internal.org.jline.utils.Log;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePageTest extends base {
	
	private static Logger Log=LogManager.getLogger(base.class.getName());//log4j
	public WebDriver driver;
	 @BeforeTest 
	 public void initialiseTest() throws IOException {
	 driver=initialiseDriver(); 
	 Log.info("Driver is initialised");
	  
	 }
	 
	
	@Test (dataProvider="getData")
	public void Test(String username, String password) throws IOException {
		
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to Test Site");//log4j
		
		LandingPage land=new LandingPage(driver);
		land.getLogin().click();
		
		LoginPage login=new LoginPage(driver);
		login.getLoginEmail().sendKeys(username);
		login.getLoginPassword().sendKeys(password);
		login.getLoginButtonClick().click();
		
	
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];//consider array size
		
		//Data set 1
		data[0][0]="apeksha@gmail.com";
		data[0][1]="Password";
		
		//Data set 2
		data[1][0]="shreya@gmail.com";
		data[1][1]="Password123";
		
		return data;
	}
	
	  @AfterTest public void teardown() { 
		  driver.close();
	  
	  }
	 
	

}

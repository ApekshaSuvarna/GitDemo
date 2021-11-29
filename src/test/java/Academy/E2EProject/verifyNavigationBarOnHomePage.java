package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;

public class verifyNavigationBarOnHomePage extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialiseTest() throws IOException {
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	public void verifyNavigationBar() throws IOException {
		
		LandingPage land=new LandingPage(driver);
		
		Assert.assertTrue(land.getNavigationBar().isDisplayed());//expected argument to be true
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		
	}

}

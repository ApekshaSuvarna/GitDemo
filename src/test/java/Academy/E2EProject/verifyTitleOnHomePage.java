package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;

public class verifyTitleOnHomePage extends base{
	public WebDriver driver; //local variable dec helps run tests in parallel mode
	@BeforeTest
	public void initialiseTest() throws IOException {
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void verifyTitle() throws IOException {
		
		LandingPage land=new LandingPage(driver);
		
		//parameters: actual, expected
		Assert.assertEquals(land.gettitleFeaturedCourses().getText(), "Featured Courses");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		
	}

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	private By login=By.cssSelector("a[class='theme-btn register-btn']"); //Encapsulation concept: declare private good coding standard so that elements are not accesible directly in other classes
	private By titleFeaturedCourses=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By navigationBar=By.cssSelector("div[class='nav-outer clearfix']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement gettitleFeaturedCourses() {
		return driver.findElement(titleFeaturedCourses);
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}

}

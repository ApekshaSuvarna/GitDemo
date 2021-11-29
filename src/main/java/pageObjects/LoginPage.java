package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	private By loginEmail = By.xpath("//input[@id='email']");//Encapsulation concept:  declare private good coding standard so that elements are not accesible directly in other classes
	private By loginPassword = By.xpath("//input[@id='password']");
	private By loginClick = By.cssSelector("input[value='Login']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLoginEmail() {
		return driver.findElement(loginEmail);
	}

	public WebElement getLoginPassword() {
		return driver.findElement(loginPassword);
	}

	public WebElement getLoginButtonClick() {
		return driver.findElement(loginClick);
	}

}

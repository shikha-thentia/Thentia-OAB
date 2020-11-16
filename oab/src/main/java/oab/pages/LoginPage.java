package oab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import oab.base.TestBase;

public class LoginPage extends TestBase {
	
	//ObjectRepositroy
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement key;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signIn;
	
	//Initializing PageObjects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AuthenticationPage login(String username, String password) {
		email.sendKeys(username);
		key.sendKeys(password);
		signIn.click();
		
		return new AuthenticationPage();
	}
	


}

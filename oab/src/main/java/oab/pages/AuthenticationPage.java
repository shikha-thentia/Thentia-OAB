package oab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import oab.base.TestBase;

public class AuthenticationPage extends TestBase {

	@FindBy(name = "security_answer")
	WebElement textBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WelcomePage login(String text) {
		textBox.sendKeys(text);
		submitButton.click();
		
		return new WelcomePage();
	}
}

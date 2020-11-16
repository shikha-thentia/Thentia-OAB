package oab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import oab.base.TestBase;

public class WelcomePage extends TestBase{

	@FindBy(xpath = "//a[@class='btn btn-brand ng-scope']")
	WebElement newApplicationBtn;
	
	
}

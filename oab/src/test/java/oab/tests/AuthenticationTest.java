package oab.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import oab.base.TestBase;
import oab.pages.AuthenticationPage;
import oab.pages.LoginPage;
import oab.pages.WelcomePage;

public class AuthenticationTest extends TestBase {
	LoginPage loginPage; 
	AuthenticationPage authenticationPage;
	WelcomePage welcomePage;
	
	public AuthenticationTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		authenticationPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void securityAnswerTest() {
		welcomePage = authenticationPage.login(prop.getProperty("text"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}

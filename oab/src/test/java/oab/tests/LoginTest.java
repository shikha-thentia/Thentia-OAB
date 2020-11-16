package oab.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import oab.pages.AuthenticationPage;
import oab.pages.LoginPage;
import oab.base.TestBase;

public class LoginTest extends TestBase {
	LoginPage loginPage; 
	AuthenticationPage authenticationPage;
	
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void login() {
		authenticationPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

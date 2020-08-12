package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class UserLoginTest extends TestBase {

	HomePage HomeObject ;
	LoginPage LoginObject ;
	
	@Test
	public void UserLoginSuccessully() {
		HomeObject = new HomePage(driver);
		HomeObject.OpenLoginLink();
		LoginObject = new LoginPage(driver) ;
		LoginObject.UserLogin("ahmeddeibrahim10@gmail.com", "123456");
		
	}
}

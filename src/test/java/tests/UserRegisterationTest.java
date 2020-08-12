package tests;



import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase {

	HomePage HomeObj ;
	UserRegisterationPage RegisterObj ;
	
	@Test
	public void UserRegisterSuccessfully() {
		HomeObj = new HomePage(driver);
		HomeObj.OpenRegisterationLink();
		RegisterObj = new UserRegisterationPage(driver);
		RegisterObj.UserRegister("Ahmed","ibrahim","ahmeddeibrahim10@gmail.com","01006830967","123456","123456");
	
	}
}

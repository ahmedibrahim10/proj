package tests;

import org.testng.annotations.Test;

import pages.AddingToCartPage;
import pages.HomePage;

public class AddingToCartTest extends TestBase {
	HomePage HomeObj ;
	AddingToCartPage AddCartObj ;
	
	@Test
	public void AddElementToCart () {
		HomeObj = new HomePage(driver);
		HomeObj.ShowAllDesktops();
		AddCartObj = new AddingToCartPage(driver);
		AddCartObj.ClickOnIphoneLink(); 
		AddCartObj.ClearQuantity();
		AddCartObj.SetQuantity("2");
		AddCartObj.AddTocart();
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingToCartPage extends PageBase {

	public AddingToCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "iPhone")
	WebElement iphoneLink ;
	
	@FindBy(id = "input-quantity")
	WebElement QuantityTxtBox ;
	
	@FindBy(id = "button-cart")
	WebElement AddToCartButton ;
	
	public void ClearQuantity() {
		QuantityTxtBox.clear();
	}
	public void SetQuantity(String Quantity) {
		setTextElementText(QuantityTxtBox, Quantity);
	}
	
	public void ClickOnIphoneLink() {
		ClickButton(iphoneLink);
	}
	public void AddTocart() {
		ClickButton(AddToCartButton);
	}
	
}

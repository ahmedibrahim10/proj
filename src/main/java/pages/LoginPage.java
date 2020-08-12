package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "input-email")
	WebElement EmailTxtBox ;
	
	@FindBy(id = "input-password")
	WebElement PasswordTxtBox ;
	
	@FindBy(css = ".btn.btn-primary")
	WebElement LoginButton ;
	
	public void UserLogin (String Email , String Password) {
		setTextElementText(EmailTxtBox, Email);
		setTextElementText(PasswordTxtBox, Password);
		ClickButton(LoginButton);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id = "input-firstname")
	WebElement FnTxtBox ;

	@FindBy(id = "input-lastname")
	WebElement LnTxtBox ;
	
	@FindBy(id = "input-email")
	WebElement EmailTxtBox ;
	
	@FindBy(id = "input-telephone")
	WebElement TeleTxtBox ;
	
	@FindBy(id = "input-password")
	WebElement PasswordTxtBox ;
	
	@FindBy(id = "input-confirm")
	WebElement ConfirmPasswordTxtBox ;
	
	@FindBy(name = "agree")
	WebElement PrivacypolicyCheck ;
	
	@FindBy(css = ".btn.btn-primary")
	WebElement ContinueButton ;
	
	public void UserRegister(String firstName, String LastName ,String email,String Telephone,String password , String ConfirmedPassword) {
		
	
		setTextElementText(FnTxtBox, firstName);
		setTextElementText( LnTxtBox , LastName);
		setTextElementText(EmailTxtBox , email);
		setTextElementText(PasswordTxtBox, password);
		setTextElementText(ConfirmPasswordTxtBox, ConfirmedPassword);
		setTextElementText(TeleTxtBox, Telephone);
		ClickButton(PrivacypolicyCheck);
		ClickButton(ContinueButton);

	}
}



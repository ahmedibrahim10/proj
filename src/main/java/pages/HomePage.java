package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	
	}

    @FindBy(css = "a.dropdown-toggle")
    WebElement MyaccLink;
    
    @FindBy(linkText = "Register")
     WebElement RegisterLink ;
    
    @FindBy(linkText = "Login")
    WebElement LoginLink ;
    
    @FindBy(linkText = "Desktops")
    WebElement DesktopsLink ;
    
    @FindBy(linkText = "Show All Desktops")
    WebElement AllDesktops ;
    
    
    public void OpenRegisterationLink() {
    	ClickButton(MyaccLink);
    	ClickButton(RegisterLink);
    }
    
    public void OpenLoginLink() {
    	ClickButton(MyaccLink);
    	ClickButton(LoginLink);
    }
    
    public void ShowAllDesktops() {
    	ClickButton(DesktopsLink);
    	ClickButton(AllDesktops);
    }
}

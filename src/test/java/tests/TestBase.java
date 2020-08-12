package tests;

import java.util.concurrent.TimeUnit;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;





public class TestBase {

	public static WebDriver driver ;



	
	
	@BeforeSuite
     public void StartDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver (2).exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://tutorialsninja.com/demo");
	}

	@AfterSuite
	public void StopDriver() {
		driver.quit();
	}


}

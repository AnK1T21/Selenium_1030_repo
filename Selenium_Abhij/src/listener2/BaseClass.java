package listener2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}

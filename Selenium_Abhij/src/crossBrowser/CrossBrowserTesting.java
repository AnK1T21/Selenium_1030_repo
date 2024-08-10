package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver;//Global variable
	
	@Parameters("Browser")
	@Test
	public void launch(String browserName)//(//@Optional("chrome")    String browserName)In case where u want to run class file instead of suite
	{
	if(browserName.equals("chrome")) //browserName.equalsignoreCase("chrome")
	{
		driver= new ChromeDriver();
	}else if (browserName.equals("firefox")) {
		driver= new FirefoxDriver();
	}else if (browserName.equals("edge")) {
		driver= new EdgeDriver();
	}
	
	driver.get("https://demowebshop.tricentis.com/");
	

}
}


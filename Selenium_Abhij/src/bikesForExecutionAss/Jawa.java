package bikesForExecutionAss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jawa {
	@Test(groups = "Smoke")
	public void launchJawa() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/");
		Reporter.log("Jawa Launched Sccessfully",true);
	}
}

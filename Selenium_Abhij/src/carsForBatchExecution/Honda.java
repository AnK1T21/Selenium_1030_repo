package carsForBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {
	@Test(groups = "smoke")
	public void launchHonda() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hondacarindia.com/");
		Reporter.log("Honda Launched Sccessfully",true);
	}

}

package carsForBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mercedes {
		@Test(groups = "smoke")
		public void launchMercedes() {
			WebDriver driver=new ChromeDriver();
			driver.get("hhttps://www.mercedes-amg.com/en/home.html");
			Reporter.log("Mercedes Launched Sccessfully",true);
		}

}

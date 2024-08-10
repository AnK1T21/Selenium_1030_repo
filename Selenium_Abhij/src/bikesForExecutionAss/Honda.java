package bikesForExecutionAss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {
@Test(groups = "Smoke")
public void launchHonda() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hondabigwing.in/");
	Reporter.log("Honda launched Successfully",true);
}
}

package bikesForExecutionAss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
@Test(groups = "Functionality")
public void launchRoyalEnfield() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.royalenfield.com/");
	Reporter.log("RoyalEnfield launched Successfully",true);
}
}

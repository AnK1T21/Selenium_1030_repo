package bikesForExecutionAss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki {
	@Test(groups = "System")
	public void launchKawasaki() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("Kawasaki Launched Sccessfully",true);
	}


}

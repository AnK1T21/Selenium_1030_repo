package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TSForCBT extends BaseClass2CBT{
	@Test
	public void clickOnLaptop() {
		
		
		//driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Laptop Page IS Displayed",true);
	}
}

package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetxt {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    String errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
    System.out.println(errormsg);
    if (errormsg.contains("Login was unsuccessful")) {
    	System.out.println("Error message is Displayed");
		
	}else {
		System.out.println("Error message is not Displayed");
	}
    
	}

}

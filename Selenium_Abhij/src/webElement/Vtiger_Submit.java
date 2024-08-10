package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger_Submit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	    WebElement UsernameTF = driver.findElement(By.id("username"));
	    Thread.sleep(2000);
	    UsernameTF.clear();
	    Thread.sleep(2000);
	    UsernameTF.sendKeys("Selenium");
	    WebElement PasswordTF=driver.findElement(By.id("password"));
	    Thread.sleep(2000);
	    PasswordTF.clear();
	    Thread.sleep(2000);
	    PasswordTF.sendKeys("1235678");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	    
	}

}

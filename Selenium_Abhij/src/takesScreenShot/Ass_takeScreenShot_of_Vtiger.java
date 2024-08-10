package takesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ass_takeScreenShot_of_Vtiger {

	public static void main(String[] args) throws InterruptedException, IOException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.vtiger.com/vtigercrm/");
    WebElement UserNameTf = driver.findElement(By.id("username"));
    Thread.sleep(2000);
    UserNameTf.clear();
    Thread.sleep(2000);
    UserNameTf.sendKeys("admin");
    WebElement PasswordTf = driver.findElement(By.id("password"));
    Thread.sleep(2000);
    PasswordTf.clear();
    Thread.sleep(2000);
    PasswordTf.sendKeys("admin");
    driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
    TakesScreenshot ts=(TakesScreenshot)driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("./ScreenShots/image.png");
    FileHandler.copy(temp, dest);    
    
    
    
    
	}

}

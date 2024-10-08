package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignFacebook {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.facebook.com/signup");
     WebElement daydropdown = driver.findElement(By.id("day"));
     Select daydrop = new Select(daydropdown);
     daydrop.selectByIndex(1);
     WebElement monthdropdown = driver.findElement(By.id("month"));
     Select monthdrop = new Select(monthdropdown);
     monthdrop.selectByValue("4");
     WebElement yeardropdown = driver.findElement(By.id("year"));
     Select Yeardrop = new Select(yeardropdown);
     Yeardrop.selectByVisibleText("2000");
     
	}

}

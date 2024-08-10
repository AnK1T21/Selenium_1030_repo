package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.facebook.com/signup");
    WebElement daydropdown = driver.findElement(By.id("day"));
     Select daySelect = new Select(daydropdown);
     //daySelect.selectByIndex(9);
     //daySelect.selectByValue("10");
     daySelect.selectByVisibleText("15");
     //To Check isMultiple()
     //System.out.println(daySelect.isMultiple());
     WebElement monthdropdown = driver.findElement(By.id("month"));
     Select monthSelect = new Select(monthdropdown);
     monthSelect.selectByVisibleText("Aug");
     WebElement yeardropdown = driver.findElement(By.id("year"));
     Select yearSelect = new Select(yeardropdown);
     yearSelect.selectByVisibleText("1947");
     
    
    
    

	}

}

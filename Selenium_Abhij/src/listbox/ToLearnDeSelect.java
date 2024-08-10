package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDeSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement priceListBox = driver.findElement(By.id("cars"));
	    Select priceSelect = new Select(priceListBox);
	    priceSelect.selectByIndex(0);
	    priceSelect.selectByValue("99");
	    priceSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
	    Thread.sleep(2000);
	    //priceSelect.deselectByIndex(1);
	    priceSelect.deselectAll();
	}

}

package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionofFB {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //driver.get("https://www.facebook.com/signup");
	    driver.get("https://demoapp.skillrary.com/");
	    //WebElement yearListBox = driver.findElement(By.id("year"));
	    WebElement priceListBox = driver.findElement(By.id("cars"));
	   // Select yearDropDown = new Select(yearListBox);
	    Select PriceDropDown = new Select(priceListBox);
	    //int index = yearDropDown.getOptions().size()-1;
	    int index = PriceDropDown.getOptions().size()-1;
	    //yearDropDown.selectByIndex(index);
	    PriceDropDown.selectByIndex(index);
	}

}

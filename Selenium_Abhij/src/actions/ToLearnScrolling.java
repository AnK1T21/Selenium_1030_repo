package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement career = driver.findElement(By.linkText("Career"));
	    Actions act =new Actions(driver);
	    //act.scrollToElement(career).perform();
	    act.scrollByAmount(0, 500).perform();
	}

}

package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {

		public static void main(String[] args) {
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://www.flipkart.com/");
		    WebElement fashionicon = driver.findElement(By.xpath("//span[text()='Fashion']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(fashionicon).perform();
		   // WebElement menwear = driver.findElement(By.xpath("/html/body/div[4]/div[1]/object/a[4]"));
		    WebElement menwear = driver.findElement(By.linkText("Men Footwear"));
		    act.moveToElement(menwear).perform();
		    WebElement casualShoe = driver.findElement(By.partialLinkText("Men's Casual Shoes"));
		    act.moveToElement(casualShoe).click().perform();

	}

}

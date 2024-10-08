package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragnDrop {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	    driver.switchTo().frame(photoframe);
	    WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    WebElement trash = driver.findElement(By.id("trash"));
	    Actions act = new Actions(driver);
	    act.scrollByAmount(0, 300).perform();
	    act.dragAndDrop(img1, trash).perform();
	    Thread.sleep(2000);
	    WebElement gallery = driver.findElement(By.id("gallery"));
	    act.dragAndDrop(img1, gallery).perform();
	}

}

package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		//driver.close();
		driver.quit();

	}

}

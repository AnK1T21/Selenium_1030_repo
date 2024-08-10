package popups;

import java.time.Duration;
import java.util.Set;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPOpUp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/products_page/15");
		String parentId = driver.getWindowHandle();
		Thread.sleep(6000);
		driver.findElement(By.id("compare")).click();
		switchToWindow(driver, "amazon");
		System.out.println(driver.getTitle());
		driver.close();
		switchToWindow(driver, "shoppersstack");
		driver.close();
		switchToWindow(driver, "flipkart");
		driver.close();

	}

	public static void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (url.contains(expUrl)) {
				break;

			}

		}
	}

}

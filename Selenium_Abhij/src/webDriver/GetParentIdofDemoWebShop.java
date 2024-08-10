package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetParentIdofDemoWebShop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (url.contains("facebook")) {
				driver.close();
				
			}
		}

		driver.switchTo().window(parentid);
		String title = driver.getTitle();
		System.out.println(title);
		
		


	}

}

package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.close();
		driver.quit();

	}

}

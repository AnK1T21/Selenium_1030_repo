package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetpageSource {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}

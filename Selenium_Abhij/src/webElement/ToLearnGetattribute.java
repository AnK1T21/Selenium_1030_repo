package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetattribute {

	public static void main(String[] args) {
    ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    String Capture = driver.findElement(By.name("q")).getAttribute("placeholder");
    System.out.println(Capture);
    
	}

}

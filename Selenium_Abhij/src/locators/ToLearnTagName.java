package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
    ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    //List<WebElement> allAnch = driver.findElements(By.tagName("a"));
    //System.out.println(allAnch.size());
    List<WebElement> allImg = driver.findElements(By.tagName("img"));
    System.out.println(allImg.size());
    
    
	}

}

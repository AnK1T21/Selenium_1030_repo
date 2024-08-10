package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSkillaryTags {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapp.skillrary.com/");
    List<WebElement> allLinks = driver.findElements(By.tagName("link"));
    System.out.println(allLinks.size());
    List<WebElement> allImg = driver.findElements(By.tagName("img"));
    System.out.println(allImg.size());
    List<WebElement> allButton = driver.findElements(By.tagName("button"));
    System.out.println(allButton.size());
	}

}

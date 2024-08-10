package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToKnowTagInAmazon {

	public static void main(String[] args) {
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/");
  List<WebElement> allButton = driver.findElements(By.tagName("button"));
  System.out.println(allButton.size());
	}

}

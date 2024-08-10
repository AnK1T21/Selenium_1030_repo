package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethodAndSubmit {

	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search store']"));
	//searchButton.click(); 
	searchButton.submit();
	}

}

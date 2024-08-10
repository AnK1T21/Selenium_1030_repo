package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonDepandindependentXpath {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/s?k=mobiles&crid=I20JM3JWNLJN&sprefix=%2Caps%2C335&ref=nb_sb_ss_recent_1_0_recent");
	driver.findElement(By.xpath("//span[contains(text(),'OnePlus')]/..//i[@class=\"a-icon a-icon-checkbox\"]")).click();
	}

}

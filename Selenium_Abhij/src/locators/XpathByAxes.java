package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("C:\\Users\\Admin\\OneDrive\\Desktop\\HTML\\newTable.html");
    String collections = driver.findElement(By.xpath("//td[contains(text(),'KGF')]/following-sibling::td[1]")).getText();
	System.out.println(collections);
	String position = driver.findElement(By.xpath("//td[contains(text(),'KGF')]/preceding-sibling::td")).getText();
	System.out.println(position);
	}

}

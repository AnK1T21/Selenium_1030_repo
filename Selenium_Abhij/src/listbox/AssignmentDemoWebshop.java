package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDemoWebshop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demowebshop.tricentis.com/books");
	    WebElement SoryBy = driver.findElement(By.id("products-orderby"));
	    Select Sort = new Select(SoryBy);
	    Sort.selectByIndex(2);
	    WebElement displayBy = driver.findElement(By.xpath("products-pagesize"));
	    Select Display = new Select(displayBy);
	    Display.selectByIndex(2);
	    WebElement ViewBy = driver.findElement(By.id("products-viewmode"));
	    Select View = new Select(ViewBy);
	    View.selectByIndex(1);
	}

}

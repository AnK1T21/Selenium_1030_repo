package listbox;

import java.time.Duration;
import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetFirstSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement priceListBox = driver.findElement(By.id("cars"));
	    Select pricebox = new Select(priceListBox);
	    pricebox.selectByIndex(2);
	    pricebox.selectByIndex(0);
	    pricebox.selectByIndex(1);
	    //WebElement firstSelected = pricebox.getFirstSelectedOption();
        //System.out.println(firstSelected.getText());
	    
	    
	    //get all selected option
	    //for iterating List<WEbElement> we use for each loop
	    
	    List<WebElement> allSelected = pricebox.getAllSelectedOptions();
	    System.out.println(allSelected.size());
	    for(WebElement option:allSelected) {
	    	System.out.println(option.getText());
	    }
	    
        
	}

}

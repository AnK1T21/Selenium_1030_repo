package hybridFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException {
		FileUtility file = new FileUtility();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(file.readTheDataFromPropertyFile("url"));
	}
	@AfterClass
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}

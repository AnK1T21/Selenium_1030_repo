package dEmoo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
@Test
public void read() throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/Resorces/DemoWeb.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String URL = prop.getProperty("url");
	String email = prop.getProperty("Email");
	System.out.println(URL);
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(URL);
	driver.findElement(By.id("")).sendKeys(email);
}
}

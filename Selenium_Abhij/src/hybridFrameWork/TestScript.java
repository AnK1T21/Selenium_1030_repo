package hybridFrameWork;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
@Test
public void EndToEndDemoWebShop() throws IOException {
	FileUtility file = new FileUtility();
	
	WelcomePage welcomePage = new WelcomePage(driver);
	welcomePage.getLoginLink().click();
	
	
	
	LoginPage loginPage = new LoginPage(driver);
	loginPage.getEmailTextField().sendKeys(file.readTheDataFromPropertyFile("Email"));
	loginPage.getPasswordTextField().sendKeys(file.readTheDataFromPropertyFile("password"));
	loginPage.getLoginButton().click();
	
	HomePage homePage = new HomePage(driver);
	homePage.getBookClick().click();
	WebElement dropDownSelect = homePage.getSelectBook();
	Select select= new Select(dropDownSelect);
	select.selectByVisibleText("Name: Z to A");
	
	homePage.getLogoutButton().click();
}
}

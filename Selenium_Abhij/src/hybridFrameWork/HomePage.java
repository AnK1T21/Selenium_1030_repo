package hybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText = "Books")
	private WebElement bookClick;
	public WebElement getBookClick() {
		return bookClick;
	}
	@FindBy(id = "products-orderby")
	private WebElement selectBook;
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	public WebElement getSelectBook() {
		return selectBook;
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	

}

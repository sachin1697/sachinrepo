package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OHomePage {
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement clickElement;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul/li[3]")
	private WebElement closeButton;
	
	public OHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logoutpage() throws InterruptedException {
		Thread.sleep(2000);
		
		clickElement.click();
		closeButton.click();
		
	}

}

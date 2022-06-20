package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OLoginPage {
	@FindBy(id="txtUsername")
	private WebElement userid;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement button;
	
	public OLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void senddata(String username, String userpass) {
		userid.sendKeys(username);
		password.sendKeys(userpass);
	}
	public void login() {
		button.click();
	}
	
	
}

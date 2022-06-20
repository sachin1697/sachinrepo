package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loginPage.OLoginPage;

public class OLoginTest extends OMainBrowser{
    OLoginPage lp;
    @Test(priority=1)
    public void login() {
    	
    	lp.senddata("Admin", "admin123");
    	lp.login();
    }
    @BeforeClass
    public void obj() {
    	lp=new OLoginPage(driver);
    }
}

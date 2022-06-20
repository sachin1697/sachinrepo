package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loginPage.OHomePage;

public class OHomeTest extends OMainBrowser{
	OHomePage lp2;
	@BeforeClass
	public void objcreation() {
		lp2=new OHomePage(driver);
		
	}
	@Test
	public void asser() {
		Assert.assertEquals("mainwindow",driver.getTitle() );
	}
  @Test
  public void ologoutpage() throws InterruptedException {
	  lp2.logoutpage();
  }
}

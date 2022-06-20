package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OMainBrowser {
	public static WebDriver driver; 
	public static Properties prop;
	public static FileInputStream fis;
	public static String path=(System.getProperty("user.dir")+"\\src\\test\\resources\\configur.Properties");
	
	@BeforeSuite
	public void browser() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		prop=new Properties();
		fis=new FileInputStream(path);
		prop.load(fis);
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterSuite
	public void closewindow() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
}

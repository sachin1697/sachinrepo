package utiluty;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class OScreenshot {
	
	   public void takeScreenshot(WebDriver driver,String name) throws IOException {
		   TakesScreenshot ss=(TakesScreenshot)driver;
		   File source=ss.getScreenshotAs(OutputType.FILE);
		   File file=new File("C:\\eclipse\\feb-26-A-morning\\Screenshot\\"+name+".png");
		   FileHandler.copy(source,file);
		   	  
	   }

}

package javaPackage1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakesScreenshot1 {
	
	static WebDriver driver;
	public static void capscreen(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
					
		}
	}

}

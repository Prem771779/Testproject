package javaPackage1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitPractice {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BookMyShow Eluru");
		
		List <WebElement> Allsugestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("No of sugessions: "+Allsugestions.size());
		String expRes = "bookmyshow eluru movies";
		for (int i = 0; i<Allsugestions.size(); i++) {
			if (Allsugestions.get(i).getText().equalsIgnoreCase(expRes)) {
				Allsugestions.get(i).click();
				break;
			}
		}
		
	}

}

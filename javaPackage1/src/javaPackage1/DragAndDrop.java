package javaPackage1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webDriver.chrome.driver", "c:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// Switching Frame
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames:- " + frame.size());
		driver.switchTo().frame(0);

		// Draggble webElement
		WebElement draggable = driver.findElement(By.id("draggable"));

		// Droppable WebElement
		WebElement droppable = driver.findElement(By.id("droppable"));

		// Using acton
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();

	}

}

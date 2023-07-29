package javaPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\software.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kaila.premchand@gmail.com");

		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("Kaila@891");
		driver.findElement(By.xpath("//*[@name='login']")).click();

		WebElement Logout = driver.findElement(By.xpath("//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x14yjl9h xudhj91 x18nykt9 xww2gxu x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 xdt5ytf x1iyjqo2 xs83m0k xl56j7k xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x6ikm8r x10wlt62 x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']//*[name()='svg']"));
		Select lout = new Select(Logout);
		lout.selectByVisibleText("Log Out");

	}

}

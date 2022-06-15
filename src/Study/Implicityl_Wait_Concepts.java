package Study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicityl_Wait_Concepts {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mens Shoes");
		
//	WebElement searchbtn=driver.findElement(By.xpath("//input[@id='gh-btn']"));
//		Actions act =new Actions(driver);
//		act.moveToElement(searchbtn).perform();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='gh-btn']"));
	Actions act=new Actions(driver);
	act.moveToElement(search).click().perform();
		
		// Page Scroll By Webelement 
	WebElement world=driver.findElement(By.xpath("//span[text()='Worldwide']"));
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", world);
		world.click();
		//ScrollToElement
		

	}

}

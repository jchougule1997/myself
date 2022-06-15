package Study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.vyomlabs.com/");
		
		driver.findElement(By.linkText("Products")).click();
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Jalindar");
		
driver.findElement(By.xpath("(//input[@class='orig'])[1]")).sendKeys("selenium");
driver.findElement(By.xpath("(//div[@class=\"innericon\"])[1]")).click();
	}

}

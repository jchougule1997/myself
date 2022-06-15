package Study;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggetions {

	public static void main(String[] args) {

		
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Jalindar");
	
	List<WebElement>name=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]"));
	int a=name.size();
	//name.contains(jalindar)
	
	if(name.contains("jalindar")){
     System.out.println("Test IS passed");		
	}else {
		System.out.println("Test is Failed");
		
	
	}
	 }
      }
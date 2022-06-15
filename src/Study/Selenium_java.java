package Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_java {

	public static void main(String[] args) {
         
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
  
	System.out.println(driver.getTitle());
	
	Actions act=new Actions(driver);
	
	//act.moveToElement()
	}

}

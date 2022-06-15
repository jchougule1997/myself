package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().perform();
        Thread.sleep(4000);
		driver.quit();
		//WebElement source=driver.findElement(By.xpath("//div[@id='draggable'];"));
		
		//WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//action.dragAndDrop(source, target).build().perform();
	}

}

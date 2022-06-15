package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
         
		//Single Cell
		driver.findElement(By.linkText("PIM")).click();
		//driver.findElement(By.linkText("Employee List")).click();
		WebElement jobtitle=driver.findElement(By.id("empsearch_job_title"));
		jobtitle.click();
		Select sel=new Select(jobtitle);
		sel.selectByIndex(4);
		
		
		//Print All the Headings For the Table
		//System.out.println(driver.findElement(By.xpath("//table[@class='table hover']/thead")));
	 
		
		
		//Print any one row of the table
	System.out.println(	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]")));

	
	int allrow=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	System.out.println(allrow);
	System.out.println(driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")));
	
	}

}

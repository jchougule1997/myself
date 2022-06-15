package Study;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class comparePage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jalindar.chougule\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String d = RandomString.make(3);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\jalindar.chougule\\eclipse-workspace\\Cogniwize\\testData " + d + ".png");
		FileHandler.copy(src, destn);

	}

}

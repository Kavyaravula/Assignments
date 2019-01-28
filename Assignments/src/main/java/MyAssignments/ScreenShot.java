package MyAssignments;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static WebDriver driver;
	
	public static void scrrenCapture(String strScreenShotName){
		
		String dateName = new SimpleDateFormat("yyyyMMMddhhmmss").format(new Date());
		//Date dateName= new Date();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\FailedSceenShots\\" + strScreenShotName + dateName
				+ ".png";
		File destinationFile = new File(destination);
		try {
			FileHandler.copy(src, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return destination;
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.cssSelector("input[name=uid]")).sendKeys("mngr173408");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("qAzYnuh");
		driver.findElement(By.cssSelector("input[name=btnLogin]")).click();
		
		scrrenCapture("test");
		
		

	}

}

package MyAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SSLCertificates {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr173408");
		driver.findElement(By.name("password")).sendKeys("qAzYnuh");
		driver.findElement(By.name("btnLogin")).click();
		

	}

}

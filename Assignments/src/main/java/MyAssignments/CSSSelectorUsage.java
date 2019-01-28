package MyAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorUsage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.cssSelector("input[name=uid]")).sendKeys("mngr173408");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("qAzYnuh");
		driver.findElement(By.cssSelector("input[name=btnLogin]")).click();
		
		String welcomeMessage1= driver.findElement(By.cssSelector("marquee")).getText();
		System.out.println(welcomeMessage1);
		
		String welcomeMessage = driver.findElement(By.xpath("//marquee[contains(text(),'Guru99 Bank')]")).getText();
		System.out.println(welcomeMessage);
	}

}

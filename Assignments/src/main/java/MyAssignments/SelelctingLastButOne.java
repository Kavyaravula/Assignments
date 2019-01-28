package MyAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelelctingLastButOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr173408");
		driver.findElement(By.name("password")).sendKeys("qAzYnuh");
		driver.findElement(By.name("btnLogin")).click();
		List<WebElement> links= driver.findElements(By.xpath("//ul[@class='menusubnav']//a")); 
		
		for (int i=0; i< links.size(); i++){
			
			System.out.println(links.get(i).getText());
		}
		
		links.get((links.size()-2)).click();
		
	}

}

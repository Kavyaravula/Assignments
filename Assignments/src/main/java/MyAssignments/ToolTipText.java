package MyAssignments;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipText extends MyScreenRecorder {

	public ToolTipText(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat,
			Format mouseFormat, Format audioFormat, File movieFolder, String name) throws IOException, AWTException {
		super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver4.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		MyScreenRecorder.startRecording("test12");
		driver.get("https://www.spicejet.com/");
		WebElement checkInBtn = driver.findElement(By.xpath("//span[text()='Check-In']"));
		Actions action = new Actions(driver);
		action.moveToElement(checkInBtn).build().perform();
		
		List<WebElement> toolTipElements = driver.findElements(By.xpath("//span[text()='Check-In']// ancestor:: li//div[@class='fareToolTip']//div[@class='fare-th-over-icon']//p"));
		
		for (WebElement e : toolTipElements){
			System.out.println(e.getText());
		}
		
		
		WebElement fAndf = driver.findElement(By.xpath("//label [contains(text(),'Family and Friends')]"));
		action.moveToElement(fAndf).build().perform();
		WebElement fafToolTip = driver.findElement(By.xpath("//label [contains(text(),'Family and Friends')]//ancestor::div[@id='familyandfriend']//span[@class='search-offer-tooltip mobile-tooltip-left']"));
		System.out.println(fafToolTip.getText());
		
		WebElement e =driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		e.click();
		
		System.out.println(e.isSelected());
		MyScreenRecorder.stopRecording();
	}

}

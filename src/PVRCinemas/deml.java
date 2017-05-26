package PVRCinemas;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import library.Utility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.james.mime4j.field.address.Mailbox;
import org.apache.log.Priority;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test
public class deml{
	static WebDriver driver;
	@BeforeSuite
public void openBrowser() throws Exception 

	{
	driver = new FirefoxDriver();
	driver.get("http://www.ticketnew.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);

}

@BeforeTest
public void location() throws InterruptedException {

if(driver.findElement(By.id("tn_city_search")).isEnabled())
	  {
		  System.out.println("Location available");
		  Thread.sleep(5000);
		  driver.findElement(By.id("tn_city_search")).click();
		  driver.findElement(By.id("tn_city_search")).sendKeys("Chennai");
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//strong[.='Delhi']//parent::div")).click();
			Thread.sleep(5000);	
	  }
	 else
	 {
		  System.out.println("Location not available");
	  }
}


/* CHENNAI */
public static void TC_2008() throws InterruptedException,Exception {
	 
 
	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='PVR Ampa Chennai']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@class='tn-seat tn-seat-available']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[.='Continue']")).click();
	Thread.sleep(10000);
	boolean resultStatus = true;
	try {
		driver.findElement(By.xpath("//h5[.='Order Summary']"));
				System.out.println("Seat selected successfully");
	} catch (Exception e) {
		resultStatus = false;
		driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed();
		driver.findElement(By.xpath("//a[.='Ok']")).click();
		assertEquals(resultStatus, true, "Seat selection error is found");
		}
}	
public static void TC_2009() throws InterruptedException, Exception {
		
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='PVR - Grand Mall - Velachery']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@class='tn-seat tn-seat-available']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[.='Continue']")).click();
	Thread.sleep(10000);
	boolean resultStatus = true;
	try {
		driver.findElement(By.xpath("//h5[.='Order Summary']"));
				System.out.println("Seat selected successfully");
	} catch (Exception e) {
		resultStatus = false;
		driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed();
		driver.findElement(By.xpath("//a[.='Ok']")).click();
		assertEquals(resultStatus, true, "Seat selection error is found");
		}
}

@AfterMethod
/* Screen shot method */
public void teardown(ITestResult result) {
if (ITestResult.FAILURE == result.getStatus());
{
	Utility.capturescreenshot(driver, result.getName());
}
}



@AfterSuite
public void closeBrowser() {
driver.close();
}
}

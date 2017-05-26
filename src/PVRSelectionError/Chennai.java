package PVRSelectionError;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Utility;

public class Chennai {
	static WebDriver driver;
	@org.testng.annotations.BeforeClass
	public void openBrowser() throws Exception 

		{
		driver = new FirefoxDriver();
		driver.get("http://www.ticketnew.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	if(driver.findElement(By.id("tn_city_search")).isEnabled())
		  {
			  System.out.println("Location available");
			  Thread.sleep(5000);
			  driver.findElement(By.id("tn_city_search")).click();
			  driver.findElement(By.id("tn_city_search")).sendKeys("Chennai");
			  Thread.sleep(5000);
			   driver.findElement(By.xpath("//strong[.='Chennai']//parent::div")).click();
				Thread.sleep(5000);	
		  }
		 else
		 {
			  System.out.println("Location not available");
		  }
	}
	@Test(priority=1)
	/* CHENNAI */
	public static void TC_2008() throws InterruptedException,Exception {
		 
	 
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PVR Ampa Chennai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[.='CLASSIC']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//td[@class='tn-seat tn-seat-available']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[.='Continue']")).click();
		Thread.sleep(20000);
		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//h5[.='Order Summary']"));
					System.out.println("Seat selected successfully");
					driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
					Thread.sleep(4000);
					if(driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed())
					{
						Thread.sleep(4000);
						driver.findElement(By.xpath("//h5[.='Alert !']//ancestor::div//a[.='Abort']")).click();
						Thread.sleep(4000);
					}
					
		} catch (Exception e) {
			resultStatus = false;
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed();
			driver.findElement(By.xpath("//a[.='Ok']//parent::div//a")).click();
			Thread.sleep(4000);;
			assertEquals(resultStatus, true, "Seat selection error is found");
			}
	}	
	@Test(priority=2)
	public static void TC_2009() throws InterruptedException, Exception {
			
		driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PVR - Grand Mall - Velachery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='CLASSIC']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='tn-seat tn-seat-available']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[.='Continue']")).click();
		Thread.sleep(10000);
		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//h5[.='Order Summary']"));
					System.out.println("Seat selected successfully");
					driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
					Thread.sleep(4000);
					if(driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed())
					{
						Thread.sleep(4000);
						driver.findElement(By.xpath("//h5[.='Alert !']//ancestor::div//a[.='Abort']")).click();
						Thread.sleep(4000);
					}
		} catch (Exception e) {
			resultStatus = false;
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed();
			driver.findElement(By.xpath("//a[.='Ok']//parent::div//a")).click();
			Thread.sleep(4000);
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

@AfterClass
public void closeBrowser() {
driver.close();
}
}


package PVRCinemas;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Utility;

public class SeatSelectionError {
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

@Test(priority=3)
public static void TC_2048() throws InterruptedException, Exception {
		
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='spnSelectedRegion']")).click();
	  driver.findElement(By.id("tn_city_search")).sendKeys("Ahmedabad");
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//strong[.='Ahmedabad']//parent::div")).click();
	   Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Cinemax Dev Arc Ahmedabad']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
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
				driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
				Thread.sleep(4000);
				if(driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed())
				{
					Thread.sleep(2000);
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

@Test(priority=4)
public static void TC_2129() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='Cinemax Red Carpet Ahemdabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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

@Test(priority=5)
public static void TC_2138() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='Cinemax Shiv Ahmedabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=6)
public static void TC_2103() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Acropolis Ahemdabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PRIME']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=7)
public static void TC_2014() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Arved Transcube Ahmedabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=8)
public static void TC_2102() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Motera Ahemdabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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

@Test(priority=9)
public static void TC_2015() throws InterruptedException, Exception {
		
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='spnSelectedRegion']")).click();
	  driver.findElement(By.id("tn_city_search")).sendKeys("Delhi-NCR");
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//strong[.='Delhi-NCR']//parent::div")).click();
	   Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='PVR Ambience Gold Gurgaon']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='PLATINUM SUPERIOR']")).click();
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
				driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
				Thread.sleep(4000);
				if(driver.findElement(By.xpath("//div[@class='tn-alert-popup animate']")).isDisplayed())
				{
					Thread.sleep(2000);
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
@Test(priority=10)
public static void TC_2016() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Ambience Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='CLASSIC SUPERIOR']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=11)
public static void TC_2044() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR City Center Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=12)
public static void TC_2001() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Sahara Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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

@Test(priority=13)
public static void TC_2058() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR MGF-Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=14)
public static void TC_2142() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Star Mall Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='GOLD']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=15)
public static void TC_2094() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Mega Mall Gurgaon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='EXECUTIVE']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=16)
public static void TC_2089() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Mahagun Ghaziabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=17)
public static void TC_2112() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Opulent Ghaziabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=18)
public static void TC_2117() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Edm Ghaziabad']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='NORMAL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=19)
public static void TC_2100() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='DT Mall Of India Noida']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='GOLD']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=20)
public static void TC_2081() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Logix 4DX Noida ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PREMIER']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=21)
public static void TC_2083() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Logix IMAX Noida ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PREMIER']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=22)
public static void TC_2082() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Logix Gold Noida ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PREMIER']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=23)
public static void TC_2085() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Logix Noida']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PREMIER']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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

@Test(priority=24)
public static void TC_2084() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Logix Play House Noida ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='4DX']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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
@Test(priority=25)
public static void TC_2045() throws InterruptedException, Exception {
	
	driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='PVR Directors Cut Ambience Delhi']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='PLATINUM']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='btn_tkt_type_continue']")).click();
	Thread.sleep(6000);
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
					Thread.sleep(2000);
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

@AfterSuite
public void closeBrowser() {
driver.close();
}
}
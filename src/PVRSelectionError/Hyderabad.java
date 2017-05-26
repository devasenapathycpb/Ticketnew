package PVRSelectionError;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class Hyderabad {
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
			  driver.findElement(By.id("tn_city_search")).sendKeys("Hyderabad");
			  Thread.sleep(5000);
			   driver.findElement(By.xpath("//strong[.='Hyderabad']//parent::div")).click();
				Thread.sleep(5000);	
		  }
		 else
		 {
			  System.out.println("Location not available");
		  }
	}

	static WebDriver driver;
	
	@Test(priority=45)
	public static void TC_2023() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR RK Cineplex Hyderabad']")).click();
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
	@Test(priority=46)
	public static void TC_2011() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Kukatpally - Hyderabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'GOLD')]")).click();
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
	@Test(priority=47)
	public static void TC_2043() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Inorbit Cyberabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='tn-green tn-tooltip > tn-select-seat']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'EXECUTIVE')]")).click();
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
	@Test(priority=48)
	public static void TC_2010() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//img[@id='imgLogo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='href_theatre']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Panjagutta - Hyderabad']")).click();
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

	@AfterClass
	public void closeBrowser() {
	driver.close();
	}
	}

	


package PVRCinemas;

import library.Utility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

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
import org.openqa.jetty.html.Select;
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
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.relevantcodes.extentreports.ExtentReports;

@Test
public class Homepage {

	static WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.get("http://www.ticketnew.com/");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	/* CHENNAI */
	public static void TC_2008() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		driver.findElement(By.xpath("//div/ul/li[.='Chennai']")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR - Ampa SkyWalk']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=2)
	/* CHENNAI */
	public static void TC_2009() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR - Grand Mall Velachery']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=3)
	/* Ahmedabad */
	public static void TC_2048() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='Ahmedabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Cinemax Dev Arc Ahmedabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=4)
	/* Ahmedabad */
	public static void TC_2129() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Cinemax Red Carpet Ahemdabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=5)
	/* Ahmedabad */
	public static void TC_2138() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Cinemax Shiv Ahmedabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=6)
	/* Ahmedabad */
	public static void TC_2014() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Arved Transcube Ahmedabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=7)
	/* Ahmedabad */
	public static void TC_2102() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Motera Ahemdabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=8)
	/* Ahmedabad */
	public static void TC_2103() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Acropolis Ahemdabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=9)
	/* NCR */
	public static void TC_2015() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='NCR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Ambience Gold Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=10)
	/* NCR */
	public static void TC_2016() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Ambience Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=11)
	/* NCR */
	public static void TC_2044() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR City Center Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=12)
	/* NCR */
	public static void TC_2001() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Sahara Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=13)
	/* NCR */
	public static void TC_2058() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR MGF-Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=14)
	/* NCR */
	public static void TC_2142() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Star Mall Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=15)
	/* NCR */
	public static void TC_2094() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Mega Mall Gurgaon']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=16)
	/* NCR */
	public static void TC_2089() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Mahagun Ghaziabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=17)
	/* NCR */
	public static void TC_2112() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Opulent Ghaziabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=18)
	/* NCR */
	public static void TC_2117() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Edm Ghaziabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=19)
	/* NCR */
	public static void TC_2100() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='DT Mall Of India Noida']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=20)
	/* NCR */
	public static void TC_2081() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Logix 4DX Noida ']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	
	@Test(priority=21)
	/* NCR */
	public static void TC_2083() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Logix IMAX Noida ']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=22)
	/* NCR */
	public static void TC_2082() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Logix Gold Noida ']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=23)
	/* NCR */
	public static void TC_2085() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Logix Noida']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=24)
	/* NCR */
	public static void TC_2084() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Logix Play House Noida ']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=25)
	/* NCR */
	public static void TC_2045() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Directors Cut Ambience Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=26)
	/* NCR */
	public static void TC_2041() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Select City Walk Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=27)
	/* NCR */
	public static void TC_2040() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Select City Walk Gold Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=28)
	/* NCR */
	public static void TC_2135() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Anupam Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=29)
	/* NCR */
	public static void TC_2127() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Priya Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=30)
	/* NCR */
	public static void TC_2125() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Promenade Vasant Kunj Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=31)
	/* NCR */
	public static void TC_2078() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR 3Cs Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=32)
	/* NCR */
	public static void TC_2122() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Plaza-CP']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=33)
	/* NCR */
	public static void TC_2126() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Prashant Vihar Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=34)
	/* NCR */
	public static void TC_2136() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Directors Cut Ambience Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=35)
	/* NCR */
	public static void TC_2143() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Sangam Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=36)
	/* NCR */
	public static void TC_2152() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Vikaspuri-Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=37)
	/* NCR */
	public static void TC_2107() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Naraina Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=38)
	/* NCR */
	public static void TC_2132() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Rivoli Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=39)
	/* NCR */
	public static void TC_2137() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Shalimar Bagh Delhi']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=40)
	/* NCR */
	public static void TC_2052() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Crown Plaza']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=41)
	/* Bhopal*/
	public static void TC_2020() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='Bhopal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Aura Bhopal']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=42)
	/* Kolkata*/
	public static void TC_2093() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='Kolkata']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Cinemax Manisquare Kolkatta']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=43)
	/* Kolkata */
	public static void TC_2021() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Avani Kolkata']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=44)
	/* Kolkata */
	public static void TC_2066() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Diamond Plaza Jassore Kolkata']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=45)
	/* Hyderabad */
	public static void TC_2023() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='Hyderabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Rk Cineplex']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}

	@Test(priority=46)
	/* Hyderabad */
	public static void TC_2011() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Kukatpally']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=47)
	/* Hyderabad */
	public static void TC_2043() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Inorbit Cyberabad']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=48)
	/* Hyderabad */
	public static void TC_2010() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Panjagutta']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=49)
	/* Banglore */
	public static void TC_2005() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a")).click();
		;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[.='Bangalore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Forum Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=50)
	/* Banglore */
	public static void TC_2031() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Market City Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=51)
	/* Banglore */
	public static void TC_2007() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Orion Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=52)
	/* Banglore */
	public static void TC_2006() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Orion Gold Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=53)
	/* Banglore */
	public static void TC_2118() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Pepsi IMAX']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=54)
	/* Banglore */
	public static void TC_2156() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Vaishnavi Sapphire Mall Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=55)
	/* Banglore */
	public static void TC_2155() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR VR Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=56)
	/* Banglore */
	public static void TC_2153() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR VR Gold Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=57)
	/* Banglore */
	public static void TC_2002() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Arena Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=58)
	/* Banglore */
	public static void TC_2154() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR IMAX']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=59)
	/* Banglore */
	public static void TC_2130() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR MSR Elements Mall Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=60)
	/* Banglore */
	public static void TC_2003() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Soul Spirit Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@Test(priority=61)
	/* Banglore */
	public static void TC_2004() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-link-theatres']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PVR Forum Bengaluru']")).click();
		Thread.sleep(2000);

		boolean resultStatus = true;
		try {
			driver.findElement(By.xpath("//div[@id='movie-name-list']//h3[.='Now Playing']"));
			System.out.println("Schedule is found. Theatres are displayed");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			resultStatus = false;
			assertEquals(resultStatus, true, "Schedule is not found in Theatres");
		}
	}
	@AfterMethod
	/* Screen shot method */
	public void teardown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus())
			;
		{
			Utility.capturescreenshot(driver, result.getName());

		}
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
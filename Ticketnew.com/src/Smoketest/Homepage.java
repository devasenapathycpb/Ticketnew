package Smoketest;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



@Test
public class Homepage
{
	
	static WebDriver driver;

	@Test
	public static void smoke() throws InterruptedException
	{
			
		driver=new FirefoxDriver();
		driver.get("http://www.ticketnew.com/");
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a//span")).click();;
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//li[3][.='Chennai']")).click();;
		Thread.sleep(2000);		
	}


public class TC002{
	@Test
	public void capturescreenshot() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("http://www.ticketnew.com/");
		driver.findElement(By.xpath("//dijljv[@id='choose_cities_chosen']//a//span")).click();;
		driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//li[3][.='Chennai']")).click();;
		Thread.sleep(2000);		
	}}


@Test
public void screenshot() throws InterruptedException
{
	driver=new FirefoxDriver();
	driver.get("http://www.ticketnew.com/");
	driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//a//span")).click();;
	driver.findElement(By.xpath("//div[@id='choose_cities_chosen']//li[3][.='Chennai']")).click();;
	Thread.sleep(2000);	
	driver.quit();
	
}
@AfterMethod
/*Screen shot method*/
public void teardown(ITestResult result)
{
if(ITestResult.FAILURE==result.getStatus());
{
	Utility.capturescreenshot(driver, result.getName());
	
	}
}
}

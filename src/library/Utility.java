package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	/*Screen shot method*/
	public class Utility {
		public static void capturescreenshot(WebDriver driver, String screenshotname)
		{
			try
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File("./Screenshot/"+screenshotname+".png"));
				System.out.println("�xception taken");
			}
			catch(Exception e)
			{
				System.out.println("�xception message"+e.getMessage());
				}
				
			}

	}
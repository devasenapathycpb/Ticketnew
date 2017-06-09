package common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Codoid-PC7 on 27-04-2017.
 */
public class Wait {


    /**
     * <h1>To create web driver session</h1>
     *
     * @return driver
     */


    public static WebElement waitForElement(WebDriver driver, By by) {
        WebElement foundElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            foundElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        } catch (Exception e) {
            e.printStackTrace();

        }
        return foundElement;
    }

    public static WebElement waitForElement(WebDriver driver, WebElement element) {
        WebElement foundElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            foundElement = wait.until(ExpectedConditions.visibilityOf(element));

        } catch (Exception e) {
            e.printStackTrace();

        }
        return foundElement;
    }
    }

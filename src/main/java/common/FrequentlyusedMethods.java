package common;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FrequentlyusedMethods {

    public static boolean click(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            Wait.waitForElement(driver, element);
            element.click();
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public static boolean verifyElementEnabled(WebElement element, WebDriver driver) {
        boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                if (element.isEnabled()) {
                    blResult = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public static boolean selectText(WebElement element, String strValues) throws InterruptedException {
        boolean isTextSelected;
        Select sel = new Select(element);
        //String strText="₹500";
        sel.selectByVisibleText(strValues);
        isTextSelected = true;
        Thread.sleep(10000);
        return isTextSelected;

    }


    public static boolean mouseOver(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            blResult = true;
            Thread.sleep(2000);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return blResult;
    }

    public static boolean navigateBack(WebDriver driver) {
        boolean isNavigated = false;
        try {
            driver.navigate().back();
            isNavigated = true;
        } catch (Exception e) {
            e.printStackTrace();
            isNavigated = false;
        }
        return isNavigated;
    }
    public static boolean enterValue(WebDriver driver, WebElement element, String strValue) {
        boolean isValueEntered = false;
        try {
            Wait.waitForElement(driver, element);
            element.click();
            element.clear();
            element.sendKeys(strValue);
        /*if(!element.getAttribute("value").equalsIgnoreCase(strValue)){
             JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeAsyncScript("arguments[0].value=arguments[1];", element,strValue);
    }
    */
            isValueEntered = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValueEntered;
    }}
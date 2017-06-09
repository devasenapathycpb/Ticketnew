package action;


import common.FrequentlyusedMethods;
import org.openqa.selenium.WebDriver;
import ui.ExtendingUIClass;


public class StepsAction extends ExtendingUIClass {


    public StepsAction(WebDriver driver) {
        super(driver);
    }


    public static boolean navigateTo(WebDriver driver, String strUrl) {
        driver.navigate().to(strUrl);
        return true;
    }

        public  boolean ClickSearchTextBox() throws InterruptedException {
            return FrequentlyusedMethods.click(driver, ClickSearchTextBox);
        }


}
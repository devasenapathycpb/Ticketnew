package ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExtendingUIClass {


    protected final WebDriver driver;

    public ExtendingUIClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(how = How.XPATH, using = "//input[@id='tn_city_search']")
    protected WebElement ClickSearchTextBox;


}
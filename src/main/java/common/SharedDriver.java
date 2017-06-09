package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SharedDriver extends EventFiringWebDriver {

    static WebDriver driver=null;
    static {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ticketnew.com/");
    }

    /**
     *
     */
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            driver.quit();
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    /**
     *
     */
    public SharedDriver() {
        super(driver);
    }


}

package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    public static WebDriver driver;

    public void setdrivers(String browser){
            if(driver == null){
                if (browser.equalsIgnoreCase("firefox")) {
                   System.setProperty("webdriver.gecko.driver","C:\\Program Files\\drivers\\geckodriver.exe");
                   driver = new FirefoxDriver();
                }
            }

        }

    public void CloseSession() {

    }
}


package pages;

import org.openqa.selenium.By;
import util.DriverUtil;

public class JustTradePage extends DriverUtil {


    By JustTradeTab = By.id("justtradetab");
    By FirstnameTextField = By.id("q1");
    By LastnameTextField = By.id("q2");
    By AddressTextField = By.id("q3");
    By PostcodeTextField = By.id("q3a");
    By EmailTextField = By.id("q4a");
    By SubmitBtn = By.id("a1");



    public void JustTradetab (){driver.findElement(JustTradeTab).click(); }

    public void Firstname (){driver.findElement(FirstnameTextField).sendKeys("Michael");}

    public void Lastname (){driver.findElement(LastnameTextField).sendKeys("Oluade");}

    public void Address (){driver.findElement(AddressTextField).sendKeys("72 Cheviot Road");}

    public void Postcode (){driver.findElement(PostcodeTextField).sendKeys("SE27 0LG");}

    public void Email (){driver.findElement(EmailTextField).sendKeys("Michaeloluade0501@gmail.com");}

    public void Submit (){driver.findElement(SubmitBtn).click();}
}

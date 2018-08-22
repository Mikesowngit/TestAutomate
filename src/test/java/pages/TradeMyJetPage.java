package pages;

import org.openqa.selenium.By;
import util.DriverUtil;

public class TradeMyJetPage extends DriverUtil {


    By TradeyourJetTab = By.id("TradeYourJetTab");
    By CurrentjetpriceTextfield = By.id("q1");
    By PurchasedforTextfield = By.id("q2");
    By MyflighttimeTextField = By.id("q3");
    By Rangeoptionyes = By.id("q5");
    By Takeofftime = By.id("q6");
    By Submit = By.id("a1");


    public void Tradeyourjettab (){driver.findElement(TradeyourJetTab).click();}

    public void CurrentjetPrice (){driver.findElement(CurrentjetpriceTextfield).sendKeys("1,000,000");}

    public void Purchasedfor (){driver.findElement(PurchasedforTextfield).sendKeys("1,500,000");}

    public void Myflighttime (){driver.findElement(MyflighttimeTextField).sendKeys("18:00");}

    public void RangeoptionY (){driver.findElement(Rangeoptionyes).click();}

    public void Takeoff (){driver.findElement(Takeofftime).click();}

    public void Submitbutton (){driver.findElement(Submit).click();}
}

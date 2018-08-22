package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class BookYourJetPage extends DriverUtil {

    By BookyourJetTab = By.id("bookyourjettab");
    By StartDestinationTextField = By.id("q1");
    By EndDestinationTextField = By.id("q2");
    By SelectZones = By.id("q15");
    By OptionUK = By.id("q16");
    By FlywithFamilyCheckbox = By.id("checkbox1");
    By FlyFirstClassCheckbox = By.id("checkbox3");
    By GroupFlightCheckbox = By.id("checkbox3");
    By YesRadioButton = By.id("q20");
    By SubmitButton = By.id("a1");



public void Bookyourjettab (){
    driver.findElement(BookyourJetTab).click();
}

public void startdestination (){
    driver.findElement(StartDestinationTextField).sendKeys("England");
}

public void enddestination (){
    driver.findElement(EndDestinationTextField).sendKeys("Jamaica");
}

public void selectzone (){
    driver.findElement(SelectZones).click();
}

public void zoneoption (){
    driver.findElement(OptionUK).click();
}

public void flywithfamily (){
    driver.findElement(FlywithFamilyCheckbox).click();
}

public void flyfirst (){
    driver.findElement(FlyFirstClassCheckbox).click();
}

public void groupflight (){
    driver.findElement(GroupFlightCheckbox).click();
}

public void yesradio (){
    driver.findElement(YesRadioButton).click();
}

public void submit (){
    driver.findElement(SubmitButton).click();
}


public void thankyoumessagepage () throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    boolean element = wait.until(ExpectedConditions.titleIs("WEG Group"));
    boolean expectedTitle = true;
    Assert.assertEquals(element,expectedTitle);
}


}

//Thread.sleep(3000);
 //       String ActualTitle = driver.getTitle();
  //      String ExpectedTitle = "WEG Group";
  //      Assert.assertEquals(ActualTitle,ExpectedTitle);
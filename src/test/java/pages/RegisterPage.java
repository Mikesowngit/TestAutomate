package pages;

import org.openqa.selenium.By;
import util.DriverUtil;

public class RegisterPage extends DriverUtil {


    By RegisterBtn = By.className("registerButton");
    By UsernameTextField = By.id("username");
    By EmailTextField = By.id("email");
    By PasswordTextField = By.id("pwd");
    By Checkbox = By.name("stayLoggedIn");
    By Submit = By.id("submitbtn");


    String BaseUrl = "http://www.test001-automatetillinfinity.co.uk/";

    public void launchurl (){
        driver.get(BaseUrl);
    }


    public void Registerbutton (){driver.findElement(RegisterBtn).click();}

    public void Username (){driver.findElement(UsernameTextField).sendKeys("Arsenal");}

    public void Email (){driver.findElement(EmailTextField).sendKeys("Michaeloluade@hotmail.co.uk");}

    public void Password (){driver.findElement(PasswordTextField).sendKeys("Arsenal123");}

    public void Checkbx (){driver.findElement(Checkbox).click();}

    public void SubmitBtn (){driver.findElement(Submit).click();}
}

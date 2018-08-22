package pages;

import org.openqa.selenium.By;
import util.DriverUtil;

public class LoginPage extends DriverUtil {

    By UsernameTextField = By.id("usernamelogin");
    By PasswordTextField = By.id("loginPassword");
    By LoginButton = By.id("LoginBtn");


    String BaseUrl =  "http://www.test001-automatetillinfinity.co.uk/";


    public void launchurl() throws InterruptedException{
        driver.get(BaseUrl);
        Thread.sleep(5000);
    }

    public void username(){
        driver.findElement(UsernameTextField).sendKeys("OluadeM0501");
    }

    public void password(){
        driver.findElement(PasswordTextField).sendKeys("123456789");
    }

    public void loginbutton(){
        driver.findElement(LoginButton).click();
    }
}
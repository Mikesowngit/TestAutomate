package stepdef;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import util.DriverUtil;

public class LoginTestSteps {

    LoginPage loginpage = new LoginPage();
    DriverUtil driverutil = new DriverUtil();

    @Before
    public void startsession(){
        driverutil.setdrivers("firefox");
    }


    @Given("^am on the landing Page$")
    public void am_on_the_landing_Page() throws Throwable {
        loginpage.launchurl();
    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        loginpage.username();
        loginpage.password();
    }

    @When("^I click login button$")
    public void i_click_login_button() throws Throwable {
        loginpage.loginbutton();
    }

    @Then("^the home page is displayed$")
    public void the_home_page_is_displayed() throws Throwable {

    }
}

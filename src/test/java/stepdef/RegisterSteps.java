package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;
import util.DriverUtil;

public class RegisterSteps extends DriverUtil {

    RegisterPage registerpage = new RegisterPage();
    DriverUtil driverutil = new DriverUtil();


    @Given("^I am on the landing page$")
public void i_am_on_the_landing_page() throws Throwable {
    registerpage.launchurl();
}

    @When("^I click the register button$")
    public void i_click_the_register_button() throws Throwable {
      registerpage.Registerbutton();
    }

    @Then("^the register page should be displayed$")
    public void the_register_page_should_be_displayed() throws Throwable {

    }

    @When("^I enter my username$")
    public void i_enter_my_username() throws Throwable {
       registerpage.Username();
    }

    @When("^I enter my Email$")
    public void i_enter_my_Email() throws Throwable {
        registerpage.Email();
    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        registerpage.Password();
    }

    @When("^click the checkbox$")
    public void click_the_checkbox() throws Throwable {
        registerpage.Checkbx();
    }
    @When("^I click the Submit button$")
    public void i_click_the_Submit_button() throws Throwable {
        registerpage.SubmitBtn();
    }

    @Then("^I should be on the home page$")
    public void i_should_be_on_the_home_page() throws Throwable {

    }
}

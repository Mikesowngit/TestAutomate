package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.JustTradePage;
import util.DriverUtil;

public class JustTradeSteps {

    JustTradePage justtradepage = new JustTradePage();
    DriverUtil driverutil = new DriverUtil();

    @Given("^I click on the just trade tab$")
public void i_click_on_the_just_trade_tab() throws Throwable {
justtradepage.JustTradetab();
}

    @When("^I enter my first name$")
    public void i_enter_my_first_name() throws Throwable {
justtradepage.Firstname();
    }

    @When("^I enter my last name$")
    public void i_enter_my_last_name() throws Throwable {
justtradepage.Lastname();
    }

    @When("^I enter my address$")
    public void i_enter_my_address() throws Throwable {
justtradepage.Address();
    }

    @When("^I enter my postcode$")
    public void i_enter_my_postcode() throws Throwable {
justtradepage.Postcode();
    }
    @When("^I enter my email$")
    public void i_enter_my_email() throws Throwable {
        justtradepage.Email();
    }

    @Then("^a we shall get back to you soonest message is displayed$")
    public void a_we_shall_get_back_to_you_soonest_message_is_displayed() throws Throwable {

    }

}

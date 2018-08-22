package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TradeMyJetPage;
import util.DriverUtil;

public class TradeMyJetSteps {

    TradeMyJetPage trademyjetpage = new TradeMyJetPage();
    DriverUtil driverutil = new DriverUtil();


    @When("^click on the trade my jet tab$")
    public void click_on_the_trade_my_jet_tab() throws Throwable {
        trademyjetpage.Tradeyourjettab();
    }

    @Then("^the trade your jet page is displayed$")
    public void the_trade_your_jet_page_is_displayed() throws Throwable {

    }

    @Then("^I enter my current jet price$")
    public void i_enter_my_current_jet_price() throws Throwable {
        trademyjetpage.CurrentjetPrice();
    }

    @Then("^I enter how much i purchased it for$")
    public void i_enter_how_much_i_purchased_it_for() throws Throwable {
        trademyjetpage.Purchasedfor();
    }

    @Then("^I enter my flight time$")
    public void i_enter_my_flight_time() throws Throwable {
        trademyjetpage.Myflighttime();
    }

    @Then("^I click no on the do you know your range option$")
    public void i_click_no_on_the_do_you_know_your_range_option() throws Throwable {
        trademyjetpage.RangeoptionY();
    }

    @Then("^I click yes on the do you know the take off time option$")
    public void i_click_yes_on_the_do_you_know_the_take_off_time_option() throws Throwable {
        trademyjetpage.Takeoff();
    }

    @Then("^a thank you message is displayed$")
    public void a_thank_you_message_is_displayed() throws Throwable {


    }
}








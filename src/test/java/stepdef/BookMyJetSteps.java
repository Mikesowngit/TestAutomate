package stepdef;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BookYourJetPage;
import util.DriverUtil;

public class BookMyJetSteps {


    BookYourJetPage bookyourjetpage = new BookYourJetPage();
    DriverUtil driverutil = new DriverUtil();


    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {

    }

    @When("^I click on the book your jet tab$")
    public void i_click_on_the_book_your_jet_tab() throws Throwable {
        bookyourjetpage.Bookyourjettab();
    }

    @Then("^the book your jet page is displayed$")
    public void the_book_your_jet_page_is_displayed() throws Throwable {

    }

    @Then("^I enter my start destination$")
    public void i_enter_my_start_destination() throws Throwable {
bookyourjetpage.startdestination();
    }

    @Then("^I enter my end destination$")
    public void i_enter_my_end_destination() throws Throwable {
        bookyourjetpage.enddestination();

    }

    @Then("^I click the select zones dropdown$")
    public void i_click_the_select_zones_dropdown() throws Throwable {
        bookyourjetpage.selectzone();

    }

    @Then("^I click UK on the zones dropdown$")
    public void i_click_UK_on_the_zones_dropdown() throws Throwable {
        bookyourjetpage.zoneoption();

    }

    @Then("^I click the flying with family checkbox$")
    public void i_click_the_flying_with_family_checkbox() throws Throwable {
        bookyourjetpage.flywithfamily();

    }

    @Then("^I click the flying first class checkbox$")
    public void i_click_the_flying_first_class_checkbox() throws Throwable {
        bookyourjetpage.flyfirst();

    }

    @Then("^I click the group flight checkbox$")
    public void i_click_the_group_flight_checkbox() throws Throwable {
        bookyourjetpage.groupflight();

    }

    @Then("^I click yes on the radio button$")
    public void i_click_yes_on_the_radio_button() throws Throwable {
        bookyourjetpage.yesradio();
    }

    @Then("^I click the submit button$")
    public void i_click_the_submit_button() throws Throwable {
        bookyourjetpage.submit();

    }

    @Then("^a thank you message page is displayed$")
    public void a_thank_you_message_page_is_displayed() throws Throwable {
        bookyourjetpage.thankyoumessagepage();

    }

@Before
    public void QuitBrowser (){
        driverutil.CloseSession();
}

}

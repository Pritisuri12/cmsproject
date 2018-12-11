package pages.logout;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

import static pages.login.Loginfile.password_xpath;
import static pages.login.Loginfile.username_xpath;

public class logoutPageSteps {

    Setupenv base = new Setupenv();

    @Given("^I am logged in as a user$")
    public void I_am_logged_in_as_a_user() throws IOException {
        base.before();

    }

    @When("^I click on logout button$")
    public void I_click_on_logout_button() {
       // base.driver.findElement(By.id(username_xpath)).sendKeys(username);
    }

    @Then("^should be logged out the application$")
    public void should_be_logged_out_the_application(){
       // base.driver.findElement(By.className(password_xpath)).sendKeys(password);

    }
}

package pages.logout;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static pages.login.Loginfile.password_xpath;
import static pages.login.Loginfile.username_xpath;

public class logoutPageSteps {

    Setupenv base = new Setupenv();

    @Given("^I am logged in as a user$")
    public void I_am_logged_in_as_a_user() throws IOException {
        base.before();

    }

    @Given("^enter the name \"([^\"]*)\"$")
    public void i_enter_the_user_name(String username) {
        base.driver.findElement(By.id(username_xpath)).sendKeys(username);
    }

    @Given("^enter the password \"([^\"]*)\"$")
    public void password_value(String password) {
        base.driver.findElement(By.className(password_xpath)).sendKeys(password);

    }

    @Given("^click on login button$")
    public void click_on_login_button() {
        WebElement ClickButton = base.driver.findElement(By.id("ida"));
        ClickButton.click();
        String url= base.driver.getCurrentUrl();
        Assert.assertEquals(url, "http://localhost:8080/cms/?1");
    }

    @When("^I click on logout button$")
    public void I_click_on_logout_button() {

        Actions actions = new Actions(base.driver);
        WebElement mainMenu = base.driver.findElement(By.id("yui-gen0"));
        actions.moveToElement(mainMenu);

        WebElement button = base.driver.findElement(By.id("id27"));
        actions.moveToElement(button);
        actions.click().build().perform();

        Actions builder = new Actions(base.driver);
        builder.moveToElement(mainMenu).perform();
       // button.waitUntilClickable().click();
        base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
       // base.driver.findElement(By.id(//*[@id="yui-gen0"]/div[3]/div[3]/div[1]/svg)).sendKeys(username);
    }

    @Then("^should be logged out the application$")
    public void should_be_logged_out_the_application(){
       String url=base.driver.getCurrentUrl();
       System.out.println(url);

    }
}

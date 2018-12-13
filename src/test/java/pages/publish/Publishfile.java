package pages.publish;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static pages.login.Loginfile.password_xpath;
import static pages.login.Loginfile.username_xpath;

public class Publishfile {
    Setupenv base = new Setupenv();

    @Given("^I am login as Author$")
    public void i_am_login_as_author() throws IOException {
        base.before();

    }

    @Given("^enter the user name \"([^\"]*)\"$")
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

    @Given("^click on content$")
    public void click_on_content() {
        base.driver.findElement(By.linkText("Content")).click();
        String text= base.driver.findElement(By.id("id45")).getText();
        // Assert.assertEquals("My Hippo Project",text);

    }

    @Given("^click on the My Hippo Project$")
    public void click_on_the_my_hippo_project()
    {
        base.driver.findElement(By.linkText("My Hippo Project")).click();

    }

    @Given("^click on the events$")
    public void click_on_the_events()
    {
        base.driver.findElement(By.linkText("events")).click();

    }

    @Given("^click on the 2018$")
    public void click_on_the_2018() {
        base.driver.findElement(By.linkText("2018")).click();
    }

    @Given("^click on the 12$")
    public void click_on_the_12() {
        base.driver.findElement(By.linkText("12")).click();
    }

    @Given("^click on test folder$")
    public void click_on_test_folder()
    {
        WebElement web1= base.driver.findElement(By.id("id113"));
        Actions builder = new Actions(base.driver);
        builder.moveToElement(web1).build().perform();

    }
    @Given("^from request tab accept the public request$")
    public void from_request_tab_accept_the_public_request()
    {

    }
    @When("^click on my Hippo Project from view tab$")
    public void click_on_my_hippo_project()
    {

    }

    @Then("^website page will be display$")
    public void website_page_will_be_displayed()
    {

    }
}

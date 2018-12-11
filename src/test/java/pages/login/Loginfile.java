package pages.login;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class Loginfile {

    public static String username_xpath = "id2";//id
    public static String password_xpath = "hippo-form-password";//classname

    public static String login_button = "ida"; //id

    Setupenv base= new Setupenv();

    @Given("^I am login as admin$")
    public void i_am_login_as_admin() throws IOException {
        base.before();
       base.driver.navigate().to(base.baseUrl);
    }

    @Given("^enter the user name \"([^\"]*)\"$")
    public void i_enter_the_user_name(String username) {
        base.driver.findElement(By.id(username_xpath)).sendKeys(username);
    }

    @Given("^enter the password \"([^\"]*)\"$")
    public void password_value(String password) {
       base.driver.findElement(By.className(password_xpath)).sendKeys(password);

    }

    @When("^click on login button$")
    public void click_on_click_button() {
        WebElement ClickButton = base.driver.findElement(By.id(login_button));
        ClickButton.click();
    }

    @Then("^should be able to login$")
    public void i_should_be_able_to_login() {
        String url= base.driver.getCurrentUrl();
        Assert.assertEquals(url, "http://localhost:8080/cms/?1");
        base.after();
    }
}

package pages.login;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPageSteps {

    public static String username_xpath = "id2";//id
    public static String password_xpath = "hippo-form-password";//classname

    public static String login_button = "ida"; //id

    public  String username ;
    public  String password ;
    Setupenv base= new Setupenv();

    @Given("^I am login as admin$")
    public void i_am_login_as_admin() {
       base.driver.navigate().to(base.baseUrl);

    }

    @Given("^I pick the the user name$")
    public void i_enter_the_user_name( ) {
        base.driver.findElement(By.xpath(username_xpath)).sendKeys(username);
    }

    @Given("^password value$")
    public void password_value() {
       base.driver.findElement(By.xpath(password_xpath)).sendKeys(password);

    }

    @When("^I click on login button$")
    public void click_on_click_button() {
        WebElement ClickButton = base.driver.findElement(By.xpath(login_button));
        ClickButton.click();
    }

    @Then("^I should be able to login$")
    public void i_should_be_able_to_login() {
        String title = base.driver.getTitle();
        Assert.assertEquals(title, "https://cms.demo.onehippo.com/?0");

    }
}

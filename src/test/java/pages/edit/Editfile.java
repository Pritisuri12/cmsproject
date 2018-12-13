package pages.edit;

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

public class Editfile{

    Setupenv base= new Setupenv();

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
    @Given("^click on channels$")
    public void click_on_channels() {
        base.driver.findElement(By.linkText("Channels")).click();
    }


    @Given("^click on My Hippo Project$")
    public void click_on_my_hippo_project(){
        base.driver.findElement(By.className("channel-name")).click();
    }

    @Given("^click on news button$")
    public void click_on_news_button()
    {
        base.driver.findElement(By.id("ext-gen6")).click();
       // clickb.click();
        base.after();
    }


   /* @Given("^click on news button$")
    public void click_on_news_button(){
        // WebElement ClickButton = base.driver.findElement(By.xpath());
        // ClickButton.click();
    }
*/
    @Given("^click on edit button$")
    public void click_on_edit_button(){

    }

    @Given("^add text on title$")
    public void add_text_on_title(){
        //base.driver.findElement(By.xpath()).sendKeys("hello");

    }

    @When("^I click on save$")
    public void i_click_on_save(){
        //   WebElement ClickButton = base.driver.findElement(By.xpath());
        // ClickButton.click();

    }

    @Then("^title is updated with the new text$")
    public void title_is_updated_with_the_new_text()
    {

    }
}

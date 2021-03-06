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
import java.util.concurrent.TimeUnit;

import static pages.login.Loginfile.password_xpath;
import static pages.login.Loginfile.username_xpath;

public class Editfile{

    Setupenv base= new Setupenv();

    @Given("^I am login as user$")
    public void i_am_login_as_user() throws IOException {
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

    @Given("^click on events button$")
    public void click_on_events_button()
    {

        WebElement ClickButton = base.driver.findElement(By.id("ext-gen6"));
        ClickButton.click();
       ///html/body/div[1]/div[2]/div/div/ul/li[2]/a
        base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;

       /*

        */
       // Actions action = new Actions(base.driver);
        //action.moveToElement(elementToHover).click(findElement(By.linkText("events"))).build().perform();
      //  base.driver.findElement(By.linkText("events")).click();

    }


    @Given("^click on the edit option$")
    public void click_on_the_edit_option(){
      //  base.driver.findElement(By.xpath("/html/body/div[2]/div[9]/button/svg/path")).click();
        base.after();

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

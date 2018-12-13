package pages.create;

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

import static java.lang.Thread.sleep;
import static pages.login.Loginfile.password_xpath;
import static pages.login.Loginfile.username_xpath;

public class Createfile {

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

    @Given("^click on down arrow$")
    public void click_on_down_arrow() throws InterruptedException {
        Actions action=new Actions(base.driver);
        WebElement text= base.driver.findElement(By.id("id130"));
        action.moveToElement(text).perform();
        base.driver.findElement(By.id("id130")).click();
        base.driver.findElement(By.linkText("Add new news item...")).click();
       // action.click().build().perform();

        sleep(1000);

       /* Actions actions = new Actions(base.driver);
        WebElement mainMenu = base.driver.findElement(By.id("id10a"));
        actions.moveToElement(mainMenu);

        WebElement subMenu = base.driver.findElement(By.linkText("add new news item"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
*/
    }

    @Given("^select the add button the event item$")
        public void select_the_first_item_from_menu() {
        WebElement ClickButton = base.driver.findElement(By.linkText("Add new News item"));
        ClickButton.click();
        base.after();
    }

    @Given("enter the name \"([^\"]*)\"$")
    public void enter_the_name(String text)
    {
     base.driver.findElement(By.id("id1e0")).sendKeys("Climate info");
    }


    @Given("^click on OK button$")
    public void click_on_ok_button()
    {
        WebElement ok_button=base.driver.findElement(By.id("id1e2"));
        ok_button.click();

    }

    @Given("^add text on title \"([^\"]*)\"$")
            public void add_text_on_title(String title)
    {
        base.driver.findElement(By.id("id1f1")).sendKeys("");
    }

    @Given("^add Text in introduction \"([^\"]*)\"$")
    public void add_text_in_introduction(String text){
        base.driver.findElement(By.id("id1f2 ")).sendKeys("Climate info");
    }

    @Given("^add Text in content\"([^\"]*)\"$")
    public void add_text_in_content(String text){
        base.driver.findElement(By.id("id1f2 ")).sendKeys("Climate info");
    }

    @Given("^click on the Set to now$")
    public void click_on_the_set_to_now()
    {
        WebElement ClickButton = base.driver.findElement(By.linkText("Set to now"));
        ClickButton.click();
    }

    @Given("^click on save and close button$")
    public void click_on_save_and_close(){
        WebElement ClickButton = base.driver.findElement(By.id("id1fe"));
        ClickButton.click();
    }


    @Given("^title is updated with the new text$")
    public void title_is_updated_with_the_new_text(){
        String header_text= base.driver.findElement(By.className("menu-action-text")).getText();

    }

    @Given("^move mouse on publication$")
    public void move_mouse_on_publication()
    {
        WebElement publish_tab=base.driver.findElement(By.id("id32d"));
        publish_tab.click();

    }

    @When("^click on publish request$")
    public void click_on_publish_request()
    {
        base.driver.findElement(By.id("id32d")).click();
    }

    @Then("^Header is changed to Publication request$")
    public void header_is_changed_publication_request()
    {

    }
}

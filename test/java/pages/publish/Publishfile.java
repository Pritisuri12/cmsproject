package pages.publish;

import common.Setupenv;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
}

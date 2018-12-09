package pages.create;

import common.Setupenv;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreatefileSteps {

    Setupenv base= new Setupenv();


    @Given("^click on channels$")
    public void click_on_channels(){
        Actions action = new Actions(driver);
        action.moveToElement("Channels").click("Channels").build().perform();

    }

    @Given("^select My Hippo Project$")
       public void select_my_hippo_project(){

    }

    @Given("^click on event button$")
    public void click_on_event_button(){
       // WebElement ClickButton = base.driver.findElement(By.xpath());
       // ClickButton.click();
    }

    @Given("^click on edit button$")
    public void click_on_edit_button(){

    }

    @Given("^add text on title$")
    public void add_text_on_title(){
        base.driver.findElement(By.xpath()).sendKeys("hello");

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

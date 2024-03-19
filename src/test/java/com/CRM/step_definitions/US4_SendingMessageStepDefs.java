package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class US4_SendingMessageStepDefs {

    LoginPage loginPage = new LoginPage();

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("is on the login page")
    public void is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user should enter valid username")
    public void user_should_enter_valid_username() {
        loginPage.enterUsername.clear();
        loginPage.enterUsername.sendKeys(ConfigurationReader.getProperty("hr_username"));
    }
    @When("user should enter valid password")
    public void user_should_enter_valid_password() {
        loginPage.enterPassword.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }
    @When("user should click login button")
    public void user_should_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should click Activity Stream")
    public void user_should_click_activity_stream() {
        activityStreamPage.activityStream.click();
    }


    @When("user clicks on the message tab")
    public void userClicksOnTheMessageTab() throws InterruptedException {
        activityStreamPage.messageBox.click();
        Thread.sleep(1);

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

    }

    @When("user should type a message on the message box")
    public void userShouldTypeAMessageOnTheMessageBox() {
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("Hello");
        Driver.getDriver().switchTo().defaultContent();
    }



    @When("user clicks on the add more button and select a user")
    public void userClicksOnTheAddMoreButtonAndSelectAUser() {
        activityStreamPage.addMoreButton.click();
        activityStreamPage.addMoreButtonType.clear();
        activityStreamPage.addMoreButtonType.sendKeys("hr15@cydeo.com" + Keys.ENTER);
    }


    @When("user should click on the send button")
    public void user_should_click_on_the_send_button(){

        activityStreamPage.sendButton.click();

    }






}

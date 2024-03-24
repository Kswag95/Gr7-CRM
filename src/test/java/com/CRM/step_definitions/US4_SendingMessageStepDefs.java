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

public class US4_SendingMessageStepDefs {

    LoginPage loginPage = new LoginPage();

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("is on the login page")
    public void is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user should login witch correct credentials")
    public void userShouldLoginWitchCorrectCredentials() {
        loginPage.login(ConfigurationReader.getProperty("marketing_username"), ConfigurationReader.getProperty("marketing_password"));
    }


    @Then("user should click Activity Stream")
    public void user_should_click_activity_stream() {
        activityStreamPage.activityStream.click();
    }


    @When("user clicks on the message tab")
    public void userClicksOnTheMessageTab() {
        activityStreamPage.messageBox.click();




    }

    @When("user should type a message on the message box")
    public void userShouldTypeAMessageOnTheMessageBox() {
        //swtiching to iframe to type message and switch back
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("Message test");
        Driver.getDriver().switchTo().defaultContent();

    }



    @When("user clicks on the add more button and select a user")
    public void userClicksOnTheAddMoreButtonAndSelectAUser() {
        //Driver.getDriver().switchTo().defaultContent();
        activityStreamPage.addMoreButton.click();
        activityStreamPage.addMoreButtonType.clear();
        activityStreamPage.addMoreButtonType.sendKeys("hr15@cydeo.com" + Keys.ENTER);
    }


    @When("user should click on the send button")
    public void user_should_click_on_the_send_button(){

        activityStreamPage.sendButton.click();

    }


    @Then("message delivery should be chosen all employees by default")
    public void messageDeliveryShouldBeChosenAllEmployeesByDefault() {
        Assert.assertTrue(activityStreamPage.allEmployees.isDisplayed());
    }


    @Then("user should click on the cancel button")
    public void userShouldClickOnTheCancelButton() {
        activityStreamPage.cancelButton.click();
    }



    @Then("user should see the the error message Please specify at least one person.")
    public void userShouldSeeTheTheErrorMessagePleaseSpecifyAtLeastOnePerson() {
        Assert.assertTrue(activityStreamPage.recipientIsNotSpecifiedError.isDisplayed());
    }

    @Then("user should see the error message The message title is not specified.")
    public void userShouldSeeTheErrorMessageTheMessageTitleIsNotSpecified() {
        Assert.assertTrue(activityStreamPage.messageIsNotSpecifiedError.isDisplayed());
    }

    @When("user should clear the recipients")
    public void userShouldClearTheRecipients() {
        Driver.getDriver().switchTo().defaultContent();
        activityStreamPage.cancelButtonOfAllEmployee.click();

    }


    @Then("user should see the error message for message {string}")
    public void userShouldSeeTheErrorMessageForMessage(String messageError) {
        Assert.assertEquals("The message title is not specified", activityStreamPage.messageIsNotSpecifiedError.getText());
    }

    @Then("user should see the the error message for recipients {string}")
    public void userShouldSeeTheTheErrorMessageForReceipients(String recipientsError) {
        Assert.assertEquals("Please specify at least one person.", activityStreamPage.recipientIsNotSpecifiedError.getText());

    }
}

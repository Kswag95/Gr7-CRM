package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.AppreciationPage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US11_AppreciationStepDefinitions{

    LoginPage loginPage = new LoginPage();

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    AppreciationPage appreciationPage = new AppreciationPage();


    @Given("user is on the login page of the application")
    public void userIsOnTheLoginPageOfTheApplication() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {

        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }
    @Then("user should click Activity Stream")
    public void user_should_click_activity_stream() {
        activityStreamPage.activityStream.click();


    }
    @When("user clicks on the more icon")
    public void userClicksOnTheMoreIcon() {

        appreciationPage.moreIcon.click();

    }
    @When("user clicks on appreciation option")
    public void userClicksOnAppreciationOption() {
        appreciationPage.appreciationOption.click();

    }

    @When("user clicks on the send button")
    public void userClicksOnTheSendButton() {
        appreciationPage.sendBtn.click();

    }
    @Then("user sees {string}")
    public void user_sees(String errorMsg) {
        Assert.assertEquals("The message title is not specified", appreciationPage.titleNotSpecifiedMsg.getText());

    }

    @When("user types any appreciation message")
    public void userTypesAnyAppreciationMessage() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        //activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("Hi");
        Driver.getDriver().switchTo().defaultContent();

    }

    @When("user closes All employees button")
    public void userClosesAllEmployeesButton() {
        appreciationPage.allEmployeesCloseBtn.click();
    }


    @Then("user reads {string}")
    public void userReads(String specifyPersonMsg) {
        Assert.assertEquals("Please specify at least one person.", appreciationPage.specifyOnePersonMsg.getText());
    }

    @Then("user sees the appreciation page with the mandatory field To: All employees by default")
    public void userSeesTheAppreciationPageWithTheMandatoryFieldToAllEmployeesByDefault() {

        Assert.assertTrue(appreciationPage.allEmployeesCloseBtn.isDisplayed());
    }
    @Then("user clicks on the cancel button at any time")
    public void userClicksOnTheCancelButtonAtAnyTime() {

        activityStreamPage.cancelButton.click();
    }


}

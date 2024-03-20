package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.AppreciationPage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Then("user enters valid credentials")
    public void userEntersValidCredentials() {

        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }
    @Given("user clicks on the more icon")
    public void userClicksOnTheMoreIcon() {

        appreciationPage.moreIcon.click();

    }
    @And("user clicks on appreciation option")
    public void userClicksOnAppreciationOption() {
        appreciationPage.appreciationOption.click();


    }


    @Then("user clicks on the send button")
    public void userClicksOnTheSendButton() {
        appreciationPage.sendBtn.click();

    }
    @Then("user sees {string}")
    public void user_sees(String errorMsg) {
        Assert.assertEquals("The message title is not specified", appreciationPage.titleNotSpecifiedMsg.getText());

    }

    @Then("user types any appreciation message")
    public void userTypesAnyAppreciationMessage() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-text'][.//*[@id='bxed_idPostFormLHE_blogPostForm']]")));
        WebElement paragraphText = Driver.getDriver().findElement();
        appreciationPage.appreciationBoxIframe.sendKeys("Thank you");

    }

    @Then("user closes All employees button")
    public void userClosesAllEmployeesButton() {
        appreciationPage.allEmployeesCloseBtn.clear();
    }


    @And("user reads {string}")
    public void userReads(String specifyPersonMsg) {
        Assert.assertEquals("Please specify at least one person.", appreciationPage.specifyOnePersonMsg.getText());
    }
}

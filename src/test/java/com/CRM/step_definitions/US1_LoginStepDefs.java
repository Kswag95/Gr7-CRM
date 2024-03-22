package com.CRM.step_definitions;


import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US1_LoginStepDefs
{
    WebDriverWait wait;
    LoginPage loginPage= new LoginPage();
    @Given("User type in application url into browser")
    public void userTypeInApplicationUrlIntoBrowser()
    {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("User in on the {string}  page")
    public void userInOnTheLoginPage(String expectedTitle)
    {
        wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        //used contain to reduce code
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @When("User types {string} in user name input box")
    public void user_types_in_user_name_input_box(String user_name)
    {
        loginPage.userNameInputBox.clear();
        loginPage.userNameInputBox.sendKeys(user_name);
    }

    @When("User types {string} in password input box")
    public void user_types_in_password_input_box(String pwd)
    {
        loginPage.passwordInputBox.sendKeys(pwd);
    }

    @When("User click on login button")
    public void user_click_on_login_button()
    {
        loginPage.logInBtn.click();
    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String msg) {
        Assert.assertTrue(
                "Error message not displayed or \""+loginPage.incorrectLoginMsg.getText() +"\" doesn't match\" "+msg+"\"",
                loginPage.incorrectLoginMsg.isDisplayed() && loginPage.incorrectLoginMsg.getText().equals(msg));
    }




    @Then("User should see bullet signs")
    public void userShouldSeeBulletSigns()
    {
        Assert.assertTrue(loginPage.passwordInputBox.getAttribute("type").equals("password"));
    }

    @When("User should see {string} checkbox")
    public void userShouldSeeCheckbox(String checkBoxText)
    {
        Assert.assertTrue(
                "Check box not displayed or \""+loginPage.rememberMeMessage+"\" doesn't match \""+checkBoxText+"\"",
                loginPage.rememberCheckBox.isDisplayed() && loginPage.rememberMeMessage.getText().equals(checkBoxText)
        );

    }

    @Then("User clicks Remember me on this computer checkbox")
    public void userClicksRememberMeOnThisComputerCheckbox()
    {
        loginPage.rememberCheckBox.click();

        Assert.assertTrue(loginPage.rememberCheckBox.isSelected());
    }
}








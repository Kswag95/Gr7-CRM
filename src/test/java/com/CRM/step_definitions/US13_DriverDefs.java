package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US13_DriverDefs
{
    WebDriverWait wait;
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @And("user should click {string}")
    public void userShouldClick(String leftMenuChoice)
    {
        activityStreamPage.extendMenuMore.click();
        wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(activityStreamPage.ActivityStreamMenu));

        for(WebElement each: activityStreamPage.ActivityStreamMenu){
            if(each.getText().equals(leftMenuChoice)){
                each.click();
                break;
            }
        }
    }

    @Then("User should see modules")
    public void userShouldSeeModules(List<String> expectedOptions)
    {
        List<String > actualOptions = new ArrayList<>();//empty list to contain actual options

        for (WebElement eachElement: activityStreamPage.mainButtonsMenu){// loops in ButtonsMenu to get text and adds in List actual options
            actualOptions.add(eachElement.getText());
        }

        Assert.assertEquals("Options doesn't match",expectedOptions,actualOptions);



    }
}

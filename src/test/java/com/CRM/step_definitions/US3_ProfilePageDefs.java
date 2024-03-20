package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class US3_ProfilePageDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    ProfilePage profilePage = new ProfilePage();

    @When("user should be able to view drop down menu after clicking on the user name")
    public void userShouldBeAbleToViewDropDownMenuAfterClickingOnTheUserName() {
        Assert.assertTrue(activityStreamPage.profilePage.isDisplayed());
        activityStreamPage.profilePage.click();
    }

    @When("user should be able to click on My Profile")
    public void userShouldBeAbleToClickOnMyProfile() {
        activityStreamPage.myProfile.click();
    }


    @Then("user should be able to see following options")
    public void userShouldBeAbleToSeeFollowingOptions(List<String> expectedOptions) {
        List<String > actualOptions = new ArrayList<>();
        for (WebElement eachElement: profilePage.profileMenuOptions){
            actualOptions.add(eachElement.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptions);
    }
}

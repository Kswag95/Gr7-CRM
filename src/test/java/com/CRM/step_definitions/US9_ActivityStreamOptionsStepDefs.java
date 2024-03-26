package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_ActivityStreamOptionsStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    //AC1

    @Then("User should be able to see MESSAGE option")
    public void user_should_be_able_to_see_message_option() {
        Assert.assertTrue(activityStreamPage.messageOption.isDisplayed());
    }
    @Then("User should be able to see TASK option")
    public void user_should_be_able_to_see_task_option() {
        Assert.assertTrue(activityStreamPage.taskOption.isDisplayed());
    }
    @Then("User should be able to see EVENT option")
    public void user_should_be_able_to_see_event_option() {
        Assert.assertTrue(activityStreamPage.eventOption.isDisplayed());
    }
    @Then("User should be able to see POLL option")
    public void user_should_be_able_to_see_poll_option() {
        Assert.assertTrue(activityStreamPage.pollOption.isDisplayed());
    }
    @Then("User should be able to see MORE option")
    public void user_should_be_able_to_see_more_option() {
        Assert.assertTrue(activityStreamPage.more.isDisplayed());
    }


    //AC2

    @When("user clicks on the MORE option")
    public void userClicksOnTheMOREOption() {
        activityStreamPage.more.click();
    }

    @Then("User should be able to see File option")
    public void userShouldBeAbleToSeeFileOption() {
        Assert.assertTrue(activityStreamPage.fileOption.isDisplayed());
    }

    @Then("User should be able to see Appreciation option")
    public void userShouldBeAbleToSeeAppreciationOption() {
        Assert.assertTrue(activityStreamPage.appreciation.isDisplayed());
    }

    @Then("User should be able to see Announcement option")
    public void userShouldBeAbleToSeeAnnouncementOption() {
        Assert.assertTrue(activityStreamPage.announcementOption.isDisplayed());
    }

    @Then("User should be able to see Workflow option")
    public void userShouldBeAbleToSeeWorkflowOption() {
        Assert.assertTrue(activityStreamPage.workflowOption.isDisplayed());
    }
}

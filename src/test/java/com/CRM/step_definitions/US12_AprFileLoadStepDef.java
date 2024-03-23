package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US12_AprFileLoadStepDef {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User clicks on MORE tab")
    public void user_clicks_on_more_tab() {
        activityStreamPage.more.click();
    }

    @When("User clicks on Appreciation")
    public void user_clicks_on_appreciation() {
        activityStreamPage.appreciation.click();
    }

    @When("User clicks on Upload files")
    public void user_clicks_on_upload_files() {
        activityStreamPage.uploadFile.click();
    }

    @And("user upload the files {string}")
    public void user_upload_the_files(String fileName) {
        activityStreamPage.uploadFile(fileName);
    }

    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String fileName) {
        BrowserUtils.waitFor(3);
        String uploadedFileText = activityStreamPage.insertedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0, fileName.indexOf("."))));
    }
        @And("User clicks on Insert in text")
        public void userClicksOnInsertInText() {
            activityStreamPage.insertInText.click();
        }

    
    @Then("user should be able to see {string} in the message")
    public void userShouldBeAbleToSeeInTheMessage(String fileName) {
        if (fileName.contains("png") || fileName.contains("jpg")){
            String actualSource = activityStreamPage.getPictureSrcFromMessage();
            Assert.assertTrue(actualSource.contains(fileName.substring(0,fileName.indexOf("."))));
        }else {
            String actualMessage = activityStreamPage.getMessageContent();
            Assert.assertTrue(actualMessage.contains(fileName));
        }
    }

    @And("User clicks on X button")
    public void userClicksOnXButton() {
        activityStreamPage.X.click();
    }
    @Then("user should not be able to see {string} in the uploaded files")
    public void userShouldNotBeAbleToSeeInTheUploadedFiles(String fileName) {
        BrowserUtils.waitFor(3);
        String uploadedFileText = activityStreamPage.insertedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));
    }
}

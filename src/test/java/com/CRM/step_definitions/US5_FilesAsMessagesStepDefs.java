package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US5_FilesAsMessagesStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("User is on Main page")
    public void user_is_on_main_page() {
        activityStreamPage.more.click();
        System.out.println("User is on Main page");
    }

    @When("User clicks {string} text input box")
    public void user_clicks_text_input_box(String string) {
        activityStreamPage.appreciation.click();
        System.out.println("User clicks {string} text input box");

    }

    @When("User clicks {string} button")
    public void user_clicks_button(String string) {
        System.out.println("User clicks {string} button");
        activityStreamPage.uploadFile.click();
    }

    @When("User clicks on Upload files and images")
    public void user_clicks_on_upload_files_and_images() {
        System.out.println("User clicks on Upload files and images");
        activityStreamPage.uploadFile.click();
    }

    @When("User select files and pictures")
    public void user_select_files_and_pictures() {
        System.out.println("User select files and pictures");
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String fileName) {
        BrowserUtils.waitFor(3);
        String uploadedFileText = activityStreamPage.uploadedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0, fileName.indexOf("."))));
        System.out.println("User clicks on {string}");
    }

    @Then("User should able to upload files and picture")
    public void user_should_able_to_upload_files_and_picture() {
        activityStreamPage.insertInText.click();
        System.out.println("User should able to upload files and picture");
    }


    @Then("User should able to insert the files and images into the text")
    public void user_should_able_to_insert_the_files_and_images_into_the_text(String fileName) {
        if (fileName.contains("png") || fileName.contains("jpg")){
            String actualSource = activityStreamPage.getPictureSrcFromMessage();
            Assert.assertTrue(actualSource.contains(fileName.substring(0,fileName.indexOf("."))));
        }else {
            String actualMessage = activityStreamPage.getMessageContent();
            Assert.assertTrue(actualMessage.contains(fileName));
        }
        System.out.println("User should able to insert the files and images into the text");
    }

    @When("User clicks X \\(remove) button")
    public void user_clicks_x_remove_button() {
        activityStreamPage.X.click();
        System.out.println("User clicks X \\(remove) button");
    }

    @Then("User can remove files and images at any time before sending")
    public void user_can_remove_files_and_images_at_any_time_before_sending(String fileName) {
        System.out.println("User can remove files and images at any time before sending");
        BrowserUtils.waitFor(3);
        String uploadedFileText = activityStreamPage.uploadedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));
    }


}

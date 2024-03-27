package com.CRM.step_definitions;
import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.CRMUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

import static com.CRM.utilities.BrowserUtils.*;
import static com.CRM.utilities.CRMUtils.getFakeMessage;

public class ActiveStreamPageStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    String expectedSentMessage;

    @When("user clicks {string}")
    public void user_clicks(String option) {
        activityStreamPage.selectOption(option);
        sleep(2);
    }

    @When("user clicks {string} in activity stream")
    public void user_clicks_in_activity_stream(String activity) {

        activityStreamPage.selectActivity(activity);
    }

    @When("user enter a message {string}")
    public void user_enter_a_message(String message) {
       // expectedSentMessage=activityStreamPage.sendMessage(message);

    }

    @When("user clicks {word} {word} with part of id {string}")
    public void user_clicks_send_button_with_part_of_id(String ignoredWord1, String ignoredWord2, String id) {
        clickElementWithPartOfId(id);
    }

    @When("user clicks {word} {word} with exact class {string}")
    public void user_clicks_send_button_with_exact_class(String ignoredWord1, String ignoredWord2, String className) {

        clickElementWithExactClassName(className);
    }

    @When("user clicks {word} {word} with exact id {string}")
    public void user_clicks_send_button_with_exact_id(String ignoredWord1, String ignoredWord2, String id) {
        clickElementWithExactId(id);
    }

    @Then("user should be able to see {word} which is sent")
    public void user_should_be_able_to_see_message_which_is_sent(String ignoredWord) {
        String actualMessage = activityStreamPage.getFirstMessage();
        Assert.assertEquals(expectedSentMessage, actualMessage);
    }

    @Then("user should be able to see message as {string}")
    public void user_should_be_able_to_see_message_as(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, activityStreamPage.errorMessage.getText());
    }

    @Then("user should be able to see the message delivery is to {string} by default")
    public void user_should_be_able_to_see_the_message_delivery_is_to_by_default(String expectedDelivery) {
        Assert.assertEquals(expectedDelivery, activityStreamPage.toSend.getText());
    }


    @Then("user should be able to see {word} {word} area with class name {string}")
    public void user_should_be_able_to_see_area_with_class_name(String ignoredWord1, String ignoredWord2, String className) {

        Assert.assertTrue(findElementWithClass(className).isDisplayed());
    }

    @When("user upload the files {string}")
    public void user_upload_the_files(String fileName) {
        activityStreamPage.uploadFile(fileName);
    }
    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String fileName) {
        waitFor(3);
        String uploadedFileText = activityStreamPage.uploadedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));
    }

    @Then("user should be able to see {string} in the message")
    public void user_should_be_able_to_see_in_the_message(String fileName) {

        if (fileName.contains("png") || fileName.contains("jpg")){
            String actualSource = activityStreamPage.getPictureSrcFromMessage();
            Assert.assertTrue(actualSource.contains(fileName.substring(0,fileName.indexOf("."))));
        }else {
            String actualMessage = activityStreamPage.getMessageContent();
            Assert.assertTrue(actualMessage.contains(fileName));
        }

    }

    @Then("user should not be able to see {word} in the uploaded files")
    public void user_should_not_be_able_to_see_in_the_uploaded_files(String ignoredWord) {
        Assert.assertTrue(activityStreamPage.uploadedFileList.size()==0);

    }

    @When("user types {string} {word} {word} with exact id {string}")
    public void user_types_with_exact_id(String message,String ignoredWord1, String ignoredWord2, String id) {
        BrowserUtils.typesWithExactId(message,id);
    }

    @When("user clicks first link in the messages")
    public void user_clicks_first_link_in_the_messages() {
       // activityStreamPage.getFirstLink().click();
    }

    @Then("user should be able to see more than one window")
    public void user_should_be_able_to_see_more_than_one_window() {
        Assert.assertTrue(BrowserUtils.getWindowSize()>1);
    }

    @Then("user should be able to see the following options on the Activity Stream page")
    public void user_should_be_able_to_see_the_following_options_on_the_activity_stream_page(List<String> expectedOptions) {
        List<String> actualOptions = getElementsText(activityStreamPage.tabOptions);

        Assert.assertEquals(expectedOptions,actualOptions);
    }



    @Then("user should be able to see the following options under more tab on the Activity Stream page")
    public void user_should_be_able_to_see_the_following_options_under_more_tab_on_the_activity_stream_page(List<String> expectedMoreOptions) {



        List<String> actualMoreOptions=  CRMUtils.getElementsAttribute("data-name",activityStreamPage.moreOptions);

        Assert.assertEquals(expectedMoreOptions,actualMoreOptions);
    }

    @Then("user should be able to see Allow multiple checkbox clicked")
    public void user_should_be_able_to_see_allow_multiple_checkbox_clicked() {
        sleep(1);
        WebElement checkBoxAllowMultiple = activityStreamPage.checkBox_allowMultiple;
        Assert.assertTrue(checkBoxAllowMultiple.isSelected());
    }

    @When("user clicks {string} under more in activity stream")
    public void user_clicks_under_more_in_activity_stream(String activity) {

        //activityStreamPage.selectMoreOption(activity);
    }
}

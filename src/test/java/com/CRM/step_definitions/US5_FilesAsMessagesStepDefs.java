package com.CRM.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US5_FilesAsMessagesStepDefs {

    @Given("User is on Main page")
    public void user_is_on_main_page() {
        System.out.println("User is on Main page");

    }

    @When("User clicks {string} text input box")
    public void user_clicks_text_input_box(String string) {
        System.out.println("User clicks {string} text input box");

    }

    @When("User clicks {string} button")
    public void user_clicks_button(String string) {
        System.out.println("User clicks {string} button");
    }

    @When("User clicks on Upload files and images")
    public void user_clicks_on_upload_files_and_images() {
        System.out.println("User clicks on Upload files and images");
    }

    @When("User select files and pictures")
    public void user_select_files_and_pictures() {
        System.out.println("User select files and pictures");
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String string) {
        System.out.println("User clicks on {string}");
    }

    @Then("User should able to upload files and picture")
    public void user_should_able_to_upload_files_and_picture() {
        System.out.println("User should able to upload files and picture");
    }


    @Then("User should able to insert the files and images into the text")
    public void user_should_able_to_insert_the_files_and_images_into_the_text() {
        System.out.println("User should able to insert the files and images into the text");
    }

    @When("User clicks X \\(remove) button")
    public void user_clicks_x_remove_button() {
        System.out.println("User clicks X \\(remove) button");
    }

    @Then("User can remove files and images at any time before sending")
    public void user_can_remove_files_and_images_at_any_time_before_sending() {
        System.out.println("User can remove files and images at any time before sending");
    }



}

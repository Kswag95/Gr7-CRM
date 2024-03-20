package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.AprFileLoad;
import com.CRM.pages.BasePage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AprFileLoadStep {
  //  AprFileLoad aprFileLoad=new AprFileLoad();
   // LoginPage loginPage=new LoginPage();

   /* @Given("User is on Activity Stream page")
    public void user_is_on_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("hr_username"),ConfigurationReader.getProperty("hr_password"));
        aprFileLoad.activityStream.click();
    }


    @When("User clicks on MORE tab")
    public void user_clicks_on_more_tab() {

        aprFileLoad.more.click();
    }
    @When("User clicks on Appreciation")
    public void user_clicks_on_appreciation() {

        aprFileLoad.appreciation.click();
    }
    @When("User clicks on Upload files")
    public void user_clicks_on_upload_files() {
        aprFileLoad.uploadFile.click();
    }

    @When("User clicks on Insert in text")
    public void user_clicks_on_insert_in_text() {


    }

    @Then("User able to upload .pdf")
    public void userAbleToUploadPdf() {
aprFileLoad.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\pdf.lnk");
        Assert.assertTrue();
    }

    @Then("User able to upload .txt")
    public void userAbleToUploadTxt() {
        aprFileLoad.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\txt.lnk");
    }

    @Then("User able to upload .jpeg")
    public void userAbleToUploadJpeg() {
        aprFileLoad.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\jpeg.lnk");
    }

    @Then("User able to upload .png")
    public void userAbleToUploadPng() {
        aprFileLoad.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\png.png");
    }

    @Then("User able to upload .docx")
    public void userAbleToUploadDocx() {
        aprFileLoad.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\docx.docx");
    }

    @Then("User can insert the pdf into the text")
    public void userCanInsertThePdfIntoTheText() {
    }

    @Then("User can insert the txt into the text")
    public void userCanInsertTheTxtIntoTheText() {
    }

    @Then("User can insert the jpeg into the text")
    public void userCanInsertTheJpegIntoTheText() {
    }

    @Then("User can insert the png into the text")
    public void userCanInsertThePngIntoTheText() {
    }

    @Then("User can insert the docx into the text")
    public void userCanInsertTheDocxIntoTheText() {
    }

    @Then("User can remove pdf at any time before sending")
    public void userCanRemovePdfAtAnyTimeBeforeSending() {
    }

    @Then("User can remove txt at any time before sending")
    public void userCanRemoveTxtAtAnyTimeBeforeSending() {
    }

    @Then("User can remove jpeg at any time before sending")
    public void userCanRemoveJpegAtAnyTimeBeforeSending() {
    }

    @Then("User can remove png at any time before sending")
    public void userCanRemovePngAtAnyTimeBeforeSending() {
    }

    @Then("User can remove docx at any time before sending")
    public void userCanRemoveDocxAtAnyTimeBeforeSending() {
 */
    ActivityStreamPage activityStreamPage=new ActivityStreamPage();
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

    @And("User clicks on Upload pdf")
    public void userClicksOnUploadPdf() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\pdf.lnk");
    }
    @Then("User able to upload pdf")
    public void userAbleToUploadPdf() {
        Assert.assertTrue(activityStreamPage.MyDriveUploadedFiles.isDisplayed());
    }


    @And("User clicks on Upload txt")
    public void userClicksOnUploadTxt() {
       activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\txt.lnk");
    }

    @Then("User able to upload txt")
    public void userAbleToUploadTxt() {
       Assert.assertTrue(activityStreamPage.MyDriveUploadedFiles.isDisplayed());
    }

    @And("User clicks on Upload jpeg")
    public void userClicksOnUploadJpeg() {
       activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\jpeg.lnk");
    }

    @Then("User able to upload jpeg")
    public void userAbleToUploadJpeg() {
        Assert.assertTrue(activityStreamPage.MyDriveUploadedFiles.isDisplayed());
    }

    @And("User clicks on Upload png")
    public void userClicksOnUploadPng() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\png.png");
    }

    @Then("User able to upload png")
    public void userAbleToUploadPng() {
            Assert.assertTrue(activityStreamPage.MyDriveUploadedFiles.isDisplayed());
        }

    @And("User clicks on Upload docx")
    public void userClicksOnUploadDocx() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\docx.docx");
    }

    @Then("User able to upload docx")
    public void userAbleToUploadDocx() {
        Assert.assertTrue(activityStreamPage.MyDriveUploadedFiles.isDisplayed());
    }
}



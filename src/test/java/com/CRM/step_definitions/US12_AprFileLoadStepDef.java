package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US12_AprFileLoadStepDef {

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

    @And("User clicks on Upload file to upload pdf")
    public void userClicksOnUploadFileToUploadPdf() {  activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\pdf.lnk");
    }
    @Then("uploaded files is displayed")
    public void uploadedFilesIsDisplayed() {
        Assert.assertTrue(activityStreamPage.myDriveUpload.isDisplayed());
    }
    @And("User clicks on Upload file to Upload txt")
    public void userClicksOnUploadFileToUploadTxt() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\txt.lnk");
    }
    @And("User clicks on Upload file to Upload jpeg")
    public void userClicksOnUploadFileToUploadJpeg() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\jpeg.lnk");
    }
    @And("User clicks on Upload file to Upload png")
    public void userClicksOnUploadFileToUploadPng() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\png.png");
    }

    @And("User clicks on Upload file to Upload docx")
    public void userClicksOnUploadFileToUploadDocx() {
        activityStreamPage.uploadFileAndImages.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\docx.docx");
    }



    @And("User clicks on Insert in text")
    public void userClicksOnInsertInText() {
       activityStreamPage.insertInText.click();
    }

    @Then("User can insert the pdf into the text")
    public void userCanInsertThePdfIntoTheText() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\pdf.lnk");
        Assert.assertTrue(activityStreamPage.uploadedPdf.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User can insert the txt into the text")
    public void userCanInsertTheTxtIntoTheText() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\txt.lnk");
        Assert.assertTrue(activityStreamPage.uploadedTxt.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User can insert the jpeg into the text")
    public void userCanInsertTheJpegIntoTheText() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\jpeg.lnk");
        Assert.assertTrue(activityStreamPage.uploadedJpeg.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User can insert the png into the text")
    public void userCanInsertThePngIntoTheText() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\png.png");
        Assert.assertTrue(activityStreamPage.uploadedPng.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User can insert the docx into the text")
    public void userCanInsertTheDocxIntoTheText() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageBoxIframe.clear();
        activityStreamPage.messageBoxIframe.sendKeys("C:\\Users\\safav\\OneDrive\\Desktop\\docx.docx");
        Assert.assertTrue(activityStreamPage.uploadedDocx.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }



    @And("User clicks on X button")
    public void userClicksOnXButton() {
        activityStreamPage.X.click();
    }

    @Then("uploaded pdf is not displayed before sending")
    public void uploadedPdfIsNotDisplayedBeforeSending() {
        Assert.assertFalse(activityStreamPage.uploadedPdf.isDisplayed());
    }

    @Then("uploaded txt is not displayed before sending")
    public void uploadedTxtIsNotDisplayedBeforeSending() {
        Assert.assertFalse(activityStreamPage.uploadedTxt.isDisplayed());
    }

    @Then("uploaded jpeg is not displayed before sending")
    public void uploadedJpegIsNotDisplayedBeforeSending() {
        Assert.assertFalse(activityStreamPage.uploadedJpeg.isDisplayed());
    }

    @Then("uploaded png is not displayed before sending")
    public void uploadedPngIsNotDisplayedBeforeSending() {
        Assert.assertFalse(activityStreamPage.uploadedPng.isDisplayed());
    }

    @Then("uploaded docx is not displayed before sending")
    public void uploadedDocxIsNotDisplayedBeforeSending() {
        Assert.assertFalse(activityStreamPage.uploadedDocx.isDisplayed());
    }


















    /*@Then("User can remove pdf at any time before sending")
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
    }

     */
}



package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage extends BasePage{

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-name")
    public WebElement profilePage;// added by LG
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement more;

    @FindBy(xpath = "//span[text()='Appreciation']")
    public WebElement appreciation;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileAndImages;

    @FindBy(xpath = "//span[contains(@id,'check-in-text')]")
    public WebElement insertInText;

    @FindBy(xpath = "//td[@class='files-del-btn']")
    public WebElement X;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;//LG

    @FindBy(xpath = "//li[@data-id='menu_live_feed']")
    public WebElement activityStream;

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm']")
    public WebElement messageBox;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;


    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addMoreButtonType;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBoxIframe;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;


    @FindBy(className = "feed-add-post-destination-text")
    public WebElement allEmployees;


    @FindBy(xpath = "//div[@id='BXSocNetLogDestination']")
    public WebElement addMoreOptions;


    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement messageIsNotSpecifiedError;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement recipientIsNotSpecifiedError;


    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement cancelButtonOfAllEmployee;

    @FindBy(xpath = "//*[contains(@id,'bxid')]")
    public WebElement uploadedFiles;
    @FindBy(xpath="//td[@class='files-storage']")
    public WebElement myDriveUploaded;
}



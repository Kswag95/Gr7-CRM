package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[@data-id='menu_live_feed']")
    public WebElement activityStream;

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm']")
    public WebElement messageBox;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;


    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addMoreButtonType;

    @FindBy(className = "popup-window-close-icon")
    public WebElement closeAddMoreButton;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBoxIframe;

}

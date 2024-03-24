package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage{


   public AppreciationPage(){
       PageFactory.initElements(Driver.getDriver(), this);

   }

   @FindBy(xpath = "//*[@id='feed-add-post-form-link-text']")
    public WebElement moreIcon;

   @FindBy(css = "span[class*='feed-add-post-form-grat-more'] .menu-popup-item-text")
    public WebElement appreciationOption;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']" )
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement titleNotSpecifiedMsg;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement appreciationBoxIframe;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement allEmployeesCloseBtn;


    @FindBy(partialLinkText = "Please specify at least one person.")
    public WebElement specifyOnePersonMsg;



}

package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_FileUploding {
    public US10_FileUploding(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "menu-counter-live-feed")
    public WebElement activityStream;
    @FindBy(xpath ="//div[@class='menu-popup-items']")
    public WebElement appreciation;
    @FindBy (id="bx-b-uploadfile-blogPostForm")
     public WebElement uploadFile;
    @FindBy(id="check-in-text-n1283")
    public WebElement insertInText;
    @FindBy(xpath = "//td[@class='files-del-btn']")
    public WebElement ex;
    @FindBy(xpath = "//input[@name='bxu_files[]']/..")
    public WebElement uploadFileAndImages;




}

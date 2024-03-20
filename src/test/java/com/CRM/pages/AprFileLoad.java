package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AprFileLoad {
    public AprFileLoad(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@data-id='menu_live_feed']")
    public WebElement activityStream;
    //@FindBy (xpath = "//span[@id='feed-add-post-form-link-more']")
    //public WebElement more;
    //@FindBy(xpath ="//span//span[text()='Appreciation']")
    //public WebElement appreciation;
    //@FindBy (id="bx-b-uploadfile-blogPostForm")
     //public WebElement uploadFile;
    //@FindBy(xpath = "//input[@name='bxu_files[]']")
    //public WebElement uploadFileAndImages;
    @FindBy(id="check-in-text-n1283")
    public WebElement insertInText;
    @FindBy(xpath = "//td[@class='files-del-btn']")
    public WebElement ex;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBoxIframe;


}

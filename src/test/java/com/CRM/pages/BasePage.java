package com.CRM.pages;


import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement userNameInputBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    public WebElement logInBtn;



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }











}

package com.CRM.pages;


import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement userNameInputBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    public WebElement logInBtn;

    @FindBy(id = "left-menu-more-btn")
    public WebElement extendMenuMore;
    @FindBy(className = "menu-item-link-text")
    public List<WebElement> ActivityStreamMenu;
    @FindBy(xpath = "//div[@class='main-buttons']//a")//main buttons menu top middle of most pages
    public List <WebElement> mainButtonsMenu;


    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }











}

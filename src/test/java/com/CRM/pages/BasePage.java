package com.CRM.pages;


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




    // when you click on siteMapMenu will have access to all menus as List <WebElement> siteMapContent;
    @FindBy(id = "sitemap-menu")
    public WebElement siteMapMenu;

    @FindBy(id = "sitemap-content")
    public WebElement siteMapContent;
    @FindBy(xpath = "//div[@id='sitemap-content']//a")
    public   List<WebElement> siteMapContentList;


   @FindBy(xpath = "//div[@class='main-buttons']//a")//main buttons menu top middle of most pages
    public List <WebElement> mainButtonsMenu;


    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }











}

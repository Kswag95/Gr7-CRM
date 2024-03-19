package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage extends BasePage{

   public AppreciationPage(){
       PageFactory.initElements(Driver.getDriver(), this);

   }

   @FindBy()
    public WebElement moreIcon;

}

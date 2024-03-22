package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage {
    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(css = ".main-buttons-item-text-title" )
    public List<WebElement>allModules;

    @FindBy(css = ".pagetitle-item")
    public WebElement companyStructure;

}



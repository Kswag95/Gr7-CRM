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

    @FindBy (xpath = "//a[@title='Employees']")
    public WebElement employeesModule;

    @FindBy (xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    @FindBy (xpath = "//html[@class='bx-core bx-no-touch bx-no-retina bx-chrome']")
    public WebElement entireHtml;





}



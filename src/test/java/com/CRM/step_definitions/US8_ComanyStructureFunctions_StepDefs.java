package com.CRM.step_definitions;

import com.CRM.pages.EmployeesPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US8_ComanyStructureFunctions_StepDefs {

    EmployeesPage employeesPage = new EmployeesPage();


    @When("User clicks on Employees Module")
    public void user_clicks_on_employees_module() {
        employeesPage.employeesModule.click();
    }

    @Then("User sees Company Structure in the Page Title")
    public void user_sees_company_structure_in_the_page_title() {
        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("Company Structure"));
    }

    @Then("User can click to add department")
    public void user_can_click_to_add_department() {
        Assert.assertTrue(employeesPage.addDepartmentButton.isDisplayed());
    }

    @Then("User can not click to add Department")
    public void user_can_not_click_to_add_department() {
        Assert.assertFalse(employeesPage.entireHtml.getText().contains("ADD DEPARTMENT"));
    }
}

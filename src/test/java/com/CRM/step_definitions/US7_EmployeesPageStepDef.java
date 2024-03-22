package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.pages.EmployeesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US7_EmployeesPageStepDef {

    ActivityStreamPage activityStreamPage =new ActivityStreamPage();

    EmployeesPage employeesPage = new EmployeesPage();

    @When("user click on the Employees button")
    public void user_click_on_the_employees_button() {activityStreamPage.employeesButton.click();

    }
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
      List<String> actualModules= new ArrayList<>();
      for (WebElement eachModule: employeesPage.allModules){
          actualModules.add(eachModule.getText());
      }

        Assert.assertEquals(expectedModules, actualModules);
    }

    @Then("user should see Company Structure as a default")
    public void user_should_see_company_structure_as_a_default() {
      Assert.assertTrue(employeesPage.companyStructure.isDisplayed());
    }


}

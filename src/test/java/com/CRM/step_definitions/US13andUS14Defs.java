package com.CRM.step_definitions;

import com.CRM.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class US13andUS14Defs {
    LoginPage myPage = new LoginPage();

    WebDriverWait wait;

    @Then("User should see modules")
    public void userShouldSeeModules(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();//empty list to contain actual options

        /*for (WebElement eachElement: myPage.mainButtonsMenu){// loops in ButtonsMenu to get text and adds in List actual options
            actualOptions.add(eachElement.getText());
        }

        Assert.assertEquals("Options doesn't match",expectedOptions,actualOptions);

    }

    @And("user click on {string} menu")
    public void userClickOnMenu(String menuChoice)
    {
        myPage.siteMapMenu.click(); // extends to see all options on menu

        wait.until(ExpectedConditions.visibilityOfAllElements(myPage.siteMapContentList)); // waits for all menu options to load

        for (WebElement eachElement: myPage.siteMapContentList){
            if (eachElement.getText().equals(menuChoice)){ // will select the given menuChoice and click on it
                eachElement.click();
                break;
            }
        }
    }

         */
    }
}

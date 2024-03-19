package com.CRM.pages;



import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(className = "errortext")
    public WebElement incorrectLoginMsg;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberCheckBox;

    @FindBy(className = "login-item-checkbox-label")
    public WebElement rememberMeMessage;

    public  void login( String userName, String password ){

        this.userNameInputBox.clear();

        this.userNameInputBox.sendKeys(userName);

        this.passwordInputBox.sendKeys(password);

        this.logInBtn.click();

    }



}

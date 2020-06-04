package com.virgingames.pages;

import com.virgingames.utility.UtilityRM;
import org.openqa.selenium.By;

/*
 * Ravi's Creation
 */

public class LoginPage extends UtilityRM {

    By usernameField = By.id("field-username");
    By passwordField = By.id("field-password");
    By loginBtn = By.xpath("//button[@class='button button-login']");
    By errorMessage = By.xpath("//div[@class='output']");

    public void enterEmailId(String email){
        sendTextToElement(usernameField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

    public String getErrorText(){
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}

package com.virgingames.testsuite;

import com.virgingames.loadproperty.LoadProperty;
import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import com.virgingames.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 */

public class LoginTest1 extends TestBase {

    LoadProperty loadProperty = new LoadProperty();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNotLoginWithInvalidCredential(){

        homePage.clickOnLoginLink();

        loginPage.enterEmailId("lucky1@gmail.com");
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();

        String expectedText = "login-form__error-message";
        String actualText = loginPage.getErrorText();
        Assert.assertEquals(expectedText, actualText);
    }

}

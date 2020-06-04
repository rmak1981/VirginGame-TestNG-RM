package com.virgingames.testbase;

import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");

    String browser1 = loadProperty.getProperty("browser1");// chrome
    String browser2 = loadProperty.getProperty("browser2");// firefox
    String browser3 = loadProperty.getProperty("browser3");// ie
    String browser4 = loadProperty.getProperty("browser4");// opera

    @BeforeMethod
    public void openBrowser(){

        //browserSelector.selectBrowser(browser1);
        browserSelector.selectBrowser(browser2);
        //browserSelector.selectBrowser(browser3);
        //browserSelector.selectBrowser(browser4);
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();;
    }

}

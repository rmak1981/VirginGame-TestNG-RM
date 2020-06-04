package com.virgingames.pages;

import com.virgingames.utility.UtilityRM;
import org.openqa.selenium.By;

/*
 * Ravi's Creation
 */
public class HomePage extends UtilityRM {

   By loginLink = By.xpath("//*[@id=\"app\"]/div/div/header/span/a[1]");


   public void clickOnLoginLink(){
       clickOnElement(loginLink);
   }

}

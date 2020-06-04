package com.virgingames.TesstNG;

import org.testng.annotations.Test;

/*
 * Ravi's Creation
 */
public class TestNG_Grouping {


    @Test(groups = {"sanity" ,"smoke"})

    public void loginTest1(){
        System.out.println("Running test - loginTest1");
    }

}

package com.virgingames.TesstNG;

import org.testng.annotations.Test;

/*
 * RBM Creation
 */
public class TestNG_Priority {

    @Test(priority = 0)
    public void testMethod01() {
        System.out.println("TestNG_Priority -> testMethod1");
    }

    @Test(priority = 1)
    public void testMethod02() {
        System.out.println("TestNG_Priority -> testMethod2");
    }

    @Test(priority = 3)
    public void testMethod03() {
        System.out.println("TestNG_Priority -> testMethod3");
    }

}
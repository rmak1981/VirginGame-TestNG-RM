package com.virgingames.TesstNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 */
@Listeners(TestNGListeners.class)
public class TestNGListenersDemo {

    @Test
    public void test001(){
        System.out.println("I am inside Test1");
    }

    @Test
    public void test002(){
        System.out.println("I am inside Test2");
        Assert.assertTrue(false);
    }

    @Test
    public void test003(){
        System.out.println("I am inside Test3");
        throw  new SkipException("This test is skipped");
    }

}

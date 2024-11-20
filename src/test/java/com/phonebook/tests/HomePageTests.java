package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test
    public void isHomeComponentPresentTest(){
//        driver.findElement(By.xpath(" //h2[contains(text(),'Welcome to our store')]"));
//        System.out.println("Home Page component is present: " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());

    }


}

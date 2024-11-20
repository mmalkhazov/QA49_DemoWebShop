package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "maynard000@gmail.com");
        type(By.name("Password"), "Maynard@gmail1234");
        click(By.cssSelector(".button-1.login-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));

    }


    @Test
    public void loginNegativeTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "maynard01@gmail.com");
        type(By.name("Password"), "Maynard@gmail1234");
        click(By.cssSelector(".button-1.login-button"));
        Assert.assertTrue(isElementPresent(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']")));

    }



}

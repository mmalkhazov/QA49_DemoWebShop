package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void registrationNewUserPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);

        click(By.cssSelector("[href='/register']"));
        type(By.name("FirstName"), "Maynard");
        type(By.name("LastName"), "Keenan");
        type(By.name("Email"), "maynard0000"+i+ "@gmail.com");
        type(By.name("Password"), "Maynard@gmail1234");
        type(By.name("ConfirmPassword"), "Maynard@gmail1234");
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".button-1.register-continue-button")));

    }

    @Test
    public void registrationExistedUserNegativeTest(){
        click(By.cssSelector("[href='/register']"));
        type(By.name("FirstName"), "Maynard");
        type(By.name("LastName"), "Keenan");
        type(By.name("Email"), "maynard00@gmail.com");
        type(By.name("Password"), "Maynard@gmail1234");
        type(By.name("ConfirmPassword"), "Maynard@gmail1234");
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.xpath("//li[text()='The specified email already exists']")));

    }


}

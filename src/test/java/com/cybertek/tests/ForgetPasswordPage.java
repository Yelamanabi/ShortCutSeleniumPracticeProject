package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForgetPasswordPage extends TestBase {


    @Test
    public void testForgetPassword(){

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("a@a.com"+ Keys.ENTER);

        String currentURL = driver.getCurrentUrl();

        //assertion
        assertTrue(currentURL.endsWith("email_sent"));


    }


    }


package com.cybertek.tests;


import com.cybertek.test_util.TestBase;
import com.cybertek.utility.BrowserUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
public class P33_Synchronization_ExplicitWait extends TestBase{
    @Test
    public void test_WaitForExpectedTitle(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(titleIs("Dynamic title"));

        WebElement successMsg = driver.findElement(By.id("alert"));
        assertTrue(successMsg.isDisplayed());

    }

    @Test
    public void test_WaitForElementClickable() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input[type='text']"));
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver,5);
        //wait.until( elementToBeClickable(inputBox) );
//        wait.until(presenceOfElementLocated(By.id("message")) );
        wait.until( textToBe(By.id("message"), "It's enabled!"));
        inputBox.sendKeys("Hello there");
        BrowserUtil.waitFor(3);



    }
}

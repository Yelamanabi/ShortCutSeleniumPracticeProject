package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P28_Synchronization_ImplicitWait  extends TestBase {

    @Test
    public void testSlowElement() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click on remove btn //button[text]()='Remove']
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        //identify the its gone elm by id message
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());


        //assert the text is it gone
        assertEquals("It's gone!", itsGoneElm.getText());


    }
}

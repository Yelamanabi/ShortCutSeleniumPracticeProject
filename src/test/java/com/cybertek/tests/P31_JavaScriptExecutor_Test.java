package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P31_JavaScriptExecutor_Test extends TestBase {

    @Test
    public void test_Scroll_whole_window() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        Thread.sleep(2000);
        // Get JavaScriptExecutor reference from driver variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        for (int i = 0; i < 10; i++) {

            jse.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);
        }

        Thread.sleep(3000);
    }

    @Test
    public void test_ScrollElementInto_the_View() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/large");
        Thread.sleep(2000);

        WebElement schoolLnk = driver.findElement(By.linkText("Cybertek School"));
        WebElement homeLnk = driver.findElement(By.linkText("Home"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)" , schoolLnk);
        Thread.sleep(1000);
        jse.executeScript("arguments[0].scrollIntoView(true)",  homeLnk  ) ;
        Thread.sleep(2000);

        jse.executeScript("alert('whats up?')"  ) ;
        Thread.sleep(4000);
    }
}

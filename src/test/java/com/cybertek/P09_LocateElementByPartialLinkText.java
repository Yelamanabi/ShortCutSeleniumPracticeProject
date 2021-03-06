package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to etsy.com
        driver.get("https://etsy.com");
        //identify and save the element on the top middle selection
        WebElement giftLink = driver.findElement(By.partialLinkText("Jewelry & Ac"));
        //Click on the link
        giftLink.click();
        //close the browser
        driver.quit();
    }

}

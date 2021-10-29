package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class P08_LocalElementByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to google.com
        driver.get("https://google.com");
        //identify and save the about link elemnt on the top
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        //click on the link
        aboutLink.click();

        Thread.sleep(5000);
        //identify and save the products link element on the top
        WebElement productsLink = driver.findElement(By.linkText("Products"));
        productsLink.click();



        //close the browser
        driver.quit();
    }
}

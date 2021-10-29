package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_LocateElementByXPath_Yahoo_Search {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://search.yahoo.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p] "));
        searchBox.sendKeys("xpath");

        driver.findElement(By.xpath("//button[@id='sbq-clear']//span[@class='sprite']")).click();
        searchBox.sendKeys("selenium locators");

        driver.findElement(By.xpath("//span[@title='Search']")).click();

        driver.quit();
    }
}

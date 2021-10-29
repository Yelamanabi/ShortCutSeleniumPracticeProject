package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class P07_LocateElementByName {
    public static void main(String[] args) {



    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium");

        WebElement searchBtn = driver.findElement(By.name("btnk"));
        searchBtn.submit();

        driver.quit();
    }
  }
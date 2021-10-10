package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_LocateElementByld {

    public static void main(String[] args) {
        //set up chrome and create Web Driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to yahoo.com
        driver.get("https://yahoo.com");

        //identify and save the element
           WebElement inputBox = driver.findElement(By.id("ybar-sbq"));
        //enter text hello
          inputBox.sendKeys("Hello");
        //click on the search button
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);


        driver.quit();

    }

    }

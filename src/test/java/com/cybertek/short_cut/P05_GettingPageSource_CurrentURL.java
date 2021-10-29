package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_GettingPageSource_CurrentURL {

    public static void main(String[] args) {
        //set up chrome and create Web Driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println("driver.getCurrentUrl() = "
                + driver.getCurrentUrl());
        // get the page source of html
        System.out.println("driver.getPageSource() = "
                + driver.getPageSource());
        driver.quit();


    }
}

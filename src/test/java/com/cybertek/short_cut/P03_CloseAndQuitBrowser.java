package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_CloseAndQuitBrowser {
    public static void main(String[] args) {
        //set up chrome and create Web Driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //close method any current browser tab that in focus
        driver.close();

        //close all browsers window opened by driver
        driver.quit();
    }

    }



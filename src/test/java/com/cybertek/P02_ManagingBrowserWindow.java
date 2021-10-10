package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_ManagingBrowserWindow {

    public static void main(String[] args) {

        //set up chrome and create Web Driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        //maximize browser window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //set the position of the window by providing from top and left offset
        driver.manage().window().setPosition( new Point(300,50));
        //get the current position of the window
        System.out.println("driver.manage().window().getPosition() = "
                + driver.manage().window().getPosition());
        //change the window size dimension
        driver.manage().window().setSize(new Dimension(200,300));
        //get the window size dimension
        System.out.println("driver.manage().window().getSize() = "
                          + driver.manage().window().getSize());


        System.out.println("THE END");


    }
}

package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * singleton pattern
 * 1.Make a consructor private
 * 2.private static filed
 * 3.public getter for the filed
 * -if the private static filed is not assidned value yet(is null)
 *
 * create new object and assign to it
 * -if not return same static field value
 *
 */
public class Driver {

    private static WebDriver obj;

    private Driver() {}

        public static WebDriver getDriver() {
            if (obj == null) {
                System.out.println("Creating object first time");
                WebDriverManager.chromedriver().setup();
                obj = new ChromeDriver();
                obj.manage().window().maximize();
                return obj ;
            }
            System.out.println("Object already exists return existing one ");
                return obj;


            }

        }





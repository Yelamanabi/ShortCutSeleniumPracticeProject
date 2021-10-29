package com.cybertek.test_util;

import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver driver;



     @BeforeAll
    public static void initBrowserDriver(){
        System.out.println("@Before All run only once before all test");

    }
    @BeforeEach
    public void setUpBrowser(){

         driver = WebDriverFactory.get("chrome");
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach

    public void closeBrowser(){
        driver.close();
    }
}

package com.cybertek;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        //1.Setup Chrome Driver so selenium can use it to automate chrome
       // WebDriverManager.chromedriver().setup();
        //2.Create Chrome Driver Object to Open browser
       // WebDriver driver = new ChromeDriver();
        //3.navigate to  https://google.com
       // driver.navigate().to("https://google.com");

        //1.Setup Firefox Driver so selenium can use it to automate chrome
        WebDriverManager.firefoxdriver().setup();
        //2.Create Firefox Driver Object to Open browser
        WebDriver driver = new FirefoxDriver();
        //3.navigate to  https://google.com
        driver.navigate().to("https://google.com");
        //maximize window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //set the position of the window by providing from






    }
}

package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_LocateElementByXPath_Yahoo_Search {

    public static void main(String[] args) {
        //set up chrome and create Web Driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to yahoo.com
        driver.get("https://search.yahoo.com");

        //use xpath to identify search box and enter "xpath"
/**
 *
 * //input[@name='p']
 * //input[@id='yschsp']
 *
 */
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p' ]"));
        searchBox.sendKeys("xpath");
        //click on x icon to clear out the text

               /**
                * //button//span[@class='sprite']
                * //button//span[@class='sprite']
                * //button[@id='sbq-clear']//span[@class='sprite']
                *
                */

               driver.findElement(By.xpath("//button[@id='sbq-clear']//span[@class='sprite']")).click();
        //enter "selenium locators" into search box
        searchBox.sendKeys("selenium locators");

        //identify search icon and click on it
        /**
         * //span[@title='Search']
         *
         *
         */
        driver.findElement(By.xpath("//span[@title='Search']")).click();



        //close
        driver.quit();
    }
}

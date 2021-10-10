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



        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p' ]"));
        searchBox.sendKeys("xpath");
        //click on x icon to clear out the text
       driver.findElement()

        //enter "selenium locators" into search box

        //identify search icon and click on it
    }
}

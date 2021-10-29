package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList {
    public static void main(String[] args) {

        //Setup ChromeDriver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/dropdown");

        //identify the select element
        WebElement dropdownElm = driver.findElement(By.id("dropdown"));
        //wrap this element inside Select object
        Select selectObj = new Select(dropdownElm);
        //use ready methods to select options
        selectObj.selectByIndex(2);//select 3rd item at index2
        selectObj.selectByValue("1");//select item with value attribute 1
        selectObj.selectByVisibleText("Option 2");

        driver.quit();

    }
}

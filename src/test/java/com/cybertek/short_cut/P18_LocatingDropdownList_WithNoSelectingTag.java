package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_LocatingDropdownList_WithNoSelectingTag {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //click to open "unusual" dropdown without select tag
        WebElement dropdownLink= driver.findElement(By.linkText("Dropdown link"));
        dropdownLink.click();

        //click item(link) with text Google
        WebElement itemGoogle = driver.findElement(By.linkText("Google"));
        itemGoogle.click();



        driver.quit();
    }
}

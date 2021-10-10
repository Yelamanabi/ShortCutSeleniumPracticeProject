package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingChekboxes {
    public static void main(String[] args) {

        //Setup ChromeDriver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println(" before click checkbox1.isSelected() = "
                + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("after click checkbox1.isSelected() = "
                + checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println(" before click checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("after click checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));

        //if we want to chek the chechbox
        if (! checkbox1.isSelected()){
            checkbox1.click();

        }else{
            System.out.println("checkbox 1 is already selected ");
        }


    }
}

package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {

        //Setup ChromeDriver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.id("blue"));
        //check if its already selected
        System.out.println("blueRadio.isSelected() = "
                + blueRadio.isSelected());
        blueRadio.click();

        //check if its already selected or not
        WebElement redRadioButton = driver.findElement(By.id("red"));
        System.out.println(" before click redRadioButton.isSelected() = "
                + redRadioButton.isSelected());
        redRadioButton.click();
        System.out.println(" after click redRadioButton.isSelected() = "
                + redRadioButton.isSelected());

        //check blue radio button not selected
        System.out.println("After selecting red blueRadio.isSelected() = "
                + blueRadio.isSelected());
        System.out.println(" -----------------------------------------------------");

        //identify green radio button
        WebElement greenRadioBtn = driver.findElement(By.id("green"));
        greenRadioBtn.click();

        System.out.println("greenRadioBtn.isSelected() = "
                + greenRadioBtn.isSelected());

        System.out.println("greenRadioBtn.isEnabled() = "
                + greenRadioBtn.isEnabled());

        List<WebElement> allColorsRadios = driver.findElements(By.name("color"));
        System.out.println("allColorsRadios.size() = " + allColorsRadios.size());

        for (WebElement eachRadioBtn : allColorsRadios){
            System.out.println("current radio button is = " + eachRadioBtn.getAttribute("id"));
            System.out.println("is it enable?() = "
                    + eachRadioBtn.isEnabled());
            System.out.println("is it selected = " + eachRadioBtn.isSelected());

        }


        driver.quit();
    }
}

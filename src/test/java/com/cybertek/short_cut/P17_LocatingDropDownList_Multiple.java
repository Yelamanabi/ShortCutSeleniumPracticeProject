package com.cybertek.short_cut;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropDownList_Multiple {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the dropdown with multiple select options
        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));
        //wrap this element inyo select object
        Select multiItemSelect = new Select(multiItemDropdown);

        //check if this element has multiselect option
        System.out.println("multiItemSelect.isMultiple() = "
                + multiItemSelect.isMultiple());

        //chek if its milti select list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        //deselect items
        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();

        driver.quit();



        //



    }
}





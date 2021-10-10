package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_FindByCssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to yahoo
        driver.get("https://search.yahoo.com");
        //<input type="text"
        // class="sbq" id="yschsp"
        // name="p" value=""
        // autocomplete="off"
        // autofocus=""
        // tabindex="1"
        // role="combobox"
        // aria-autocomplete="both">
        WebElement searchBox = driver.findElement(By.cssSelector("yschsp"));
        searchBox.sendKeys("css selector");

        WebElement cearchIcon = driver.findElement(By.cssSelector("button#sbq-clear > span.sprite"));
        cearchIcon.click();

        //use css selector to identify search box and enter "css selector"

        //click on x icon to clear out the text

        //enter "selenium locators" into search box
        searchBox.sendKeys("selenium locators");
        //<span role="button" title="Search" class="ico-syc mag-glass"></span>
        WebElement searchIcon = driver.findElement(By.cssSelector("span.ico-syc.mag-glass[title='Search']"));
        searchIcon.click();

        //identify search icon and click on it
    }
}

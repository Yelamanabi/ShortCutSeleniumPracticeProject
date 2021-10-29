package com.cybertek.short_cut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P13_Practice1 {
    public static void main(String[] args) throws InterruptedException {

        //Setup ChromeDriver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.get("https://saucedemo.com");
         //make the window maximize
        driver.manage().window().maximize();


        //print out the page title
        String title = driver.getTitle();
        System.out.println("title = " + title);


        //enter username provide ; standard_user
        //WebElement usernameBox = driver.findElement(By.name("user-name"));
        WebElement usernameBox = driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");



        //enter password provider : secret_sauce
        //WebElement passwordBox = driver.findElement(By.name("password"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        //click on login button to go Log in btn
        //WebElement loginBtn = driver.findElement(By.name("login-button"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();


        ///get the name and price of first product

        //assuming we know product name just using link text
        WebElement firstProductLnk = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLnk.getAttribute(\"id\") = "
                + firstProductLnk.getAttribute("id"));

        //assuming we don't kn ow the product name but we know we want to get first item anyway
        WebElement firstProductLnk1 = driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductLnk1.getText() = "
                + firstProductLnk1.getText());

        WebElement firstProductLnk2 = driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProductLnk2 = "
                + firstProductLnk2.getText());

        //get all product names into List<WebElement>
        List<WebElement> allProductTitle = driver.findElements(By.className("inventory_item_name"));


        //get the count
        System.out.println("Product count is  = " + allProductTitle.size());
        //print all product title
        for (WebElement eachProductTitle : allProductTitle){
            String productTitleText = eachProductTitle.getText();
            System.out.println(" product Title Text  = " + productTitleText);
        }



        //click on the shopping cart link top right corner
        WebElement cartContainerElement = driver.findElement(By.id("shopping_cart_container"));
        cartContainerElement.click();
        Thread.sleep(5000);

        //click on continue to shop button to come back to product page
        WebElement continueShoppingBtn = driver.findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();

        Thread.sleep(5000);

        //quit the browser
        driver.quit();


    }
}

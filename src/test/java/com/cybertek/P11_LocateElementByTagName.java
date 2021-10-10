package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import java.util.List;

public class P11_LocateElementByTagName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to practice web site
        driver.get("http://practice.cybertekschool.com/");

        //identify and save the first element with<a> tag
        WebElement firstLnk = driver.findElement(By.tagName("a"));
        //print out the text
        System.out.println("firstLnk.getText() = "
                + firstLnk.getText());



        //identify abd save all the elements with <a> tag
        //find elements method will return List<WebElement>
       List<WebElement > allLinks =  driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        //iterate over this list and get the text of all the link WebElement
        for(WebElement eachLink : allLinks){

            System.out.println("Link text is " + eachLink.getText());
        }

        //click on the link

        firstLnk.click();
        driver.quit();
    }
}

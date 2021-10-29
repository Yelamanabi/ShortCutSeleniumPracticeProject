package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P25_JavaScriptAlertTest extends TestBase {

    @Test

    public void testAlert (){

    driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();//click ok button
       // Alert alertObj = driver.switchTo().alert();
       // alertObj.accept();

       WebElement confirmBtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
       confirmBtn.click();
        driver.switchTo().alert().accept();//click ok button
        confirmBtn.click();
        driver.switchTo().alert().dismiss();//click cancel button


        WebElement promptBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptBtn.click();

        Alert alertObj = driver.switchTo().alert();

        System.out.println("popup text is:+ " + alertObj.getText());
        alertObj.sendKeys("Hello there ");
        alertObj.accept();

        System.out.println("END");


}
}

package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P28_FileUploadTest extends TestBase {
    @Test
    public void testFileUpload(){

        driver.get("http://practice.cybertekschool.com/upload");
        String filePath = "/Users/yelamanabiyev/Downloads/Katon-Karagai,_East_Kazakhstan_-_panoramio.jpeg";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        System.out.println("END");

    }



}

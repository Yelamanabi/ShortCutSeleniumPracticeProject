package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P26_Webtables extends TestBase {

    @Test
    public void testWebTables(){

        driver.get("http://practice.cybertekschool.com/tables");



        String cell42Locator = "//table[@id='table1']/tbody/tr[4]/td[2]";

        WebElement cell42 = driver.findElement(By.xpath(cell42Locator));

        System.out.println("call42 text  = " + cell42.getText());

        String timCellLocator = "//table[@id='table1']//td[text()='Tim']";

        WebElement cellTim = driver.findElement(By.xpath(timCellLocator));

        System.out.println("cellTim.getText() = " + cellTim.getText());

    }
}

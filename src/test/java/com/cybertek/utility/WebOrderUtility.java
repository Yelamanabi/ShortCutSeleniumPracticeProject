package com.cybertek.utility;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtility {
    /**
     * Navigate to WebOrder App
     *
     * @param driverParam
     */
    public static void openWebOrderApp(WebDriver driverParam) {

        driverParam.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

    }

    /**
     * login with fixed username password
     *
     * @param driverParam
     */


    public static void login(WebDriver driverParam) {

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    /**
     * logging out from app
     *
     * @param driverParam
     */
    public static void login(WebDriver driverParam, String username, String password) {

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();


    }

    public static void logout(WebDriver driverParam){

        driverParam.findElement(By.id("ctl00_logout")).click();
    }

}
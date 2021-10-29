package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P34_WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        //river.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
        WebOrderUtility.openWebOrderApp(driver);


        //  driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
       // driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        WebOrderUtility.login(driver);

        WebOrderUtility.logout(driver);

        WebOrderUtility.login(driver,"Tester","test");

        WebOrderUtility.logout(driver);

        BrowserUtil.waitFor(3);





    }

}

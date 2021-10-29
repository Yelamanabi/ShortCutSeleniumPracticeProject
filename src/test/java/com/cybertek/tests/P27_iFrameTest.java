package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P27_iFrameTest extends TestBase {
    @Test
    public void test_iFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");

        //switch to the iframe using index
        //driver.switchTo().frame(0);
        //switch to the iframe using id or name
        //driver.switchTo().frame("mce_0_ifr");
        WebElement iFrameElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrameElm);


        //identify the <p> element inside the frame
        WebElement pTagElmInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagElmInsideFrame text = " + pTagElmInsideFrame.getText());

        //switch out frame
        //driver.switchTo().defaultContent();//this will switch to top level html

        driver.switchTo().parentFrame();//this will switch back up one level inside nested html document

        //click o home btn
        driver.findElement(By.linkText("Home")).click();

    }
    @Test
public void test_Nested_iFramee(){
    driver.get("http://practice.cybertekschool.com/nested_frames");

    //main content --> top ,  bottom
        //top --> left , middle , right frame

        //get the text out of bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrmBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("bottomFrmBodyElm.getText() = " + bottomFrmBodyElm.getText());
         //switch to parent fram e
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //go to middle frame and get text
        //first go to top frame then go to middle frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv = driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

        //go to the right frame
        driver.switchTo().parentFrame(); //now we are at top frame
        driver.switchTo().frame("frame-right");
        WebElement rightFrameBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("rightFrameBodyElm.getText() = " + rightFrameBodyElm.getText());
        //go back to default content
        driver.switchTo().defaultContent();


    }
}
package com.cybertek.tests;

import com.cybertek.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class P30_ActionsClassTest extends TestBase {

    @Test
    public void testPerformHoverAction(){

        driver.get("http://practice.cybertekschool.com/hovers");

        // hover over to the first image

        // identify the first element , verify the text displayed under
        /**
         *
         * (//div[@class='figure']/img)[1]
         * //img[1]
         *
         * //h5[.='name: user1']
         */
        WebElement firstImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        WebElement firstImageText = driver.findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println("Before firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertFalse( firstImageText.isDisplayed());
        // Create Actions class object
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        System.out.println("After hover firstImageText.isDisplayed = " + firstImageText.isDisplayed());
        assertTrue( firstImageText.isDisplayed());
        System.out.println("END");
    }
    @Test
    public void testDragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        System.out.println("bigCircle.getText() = " + bigCircle.getText());

        Actions actions = new Actions(driver) ;
//        actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.moveToElement(smallCircle).pause(1000)
                .clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release()
                .perform();
        System.out.println("bigCircle.getText() = " + bigCircle.getText());


        assertEquals("You did great!",bigCircle.getText() );

//        Thread.sleep(3000);

    }
    @Test
    public void testKeyboardAction() throws InterruptedException {

        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        // click on the element
        // hold down to the shift and enter text
        // release the shift and enter text
        // hold down to Command on mac , Control on windows enter A to select all
        // send keys backspace
        // pause 1 seconds in between actions
        Actions actions = new Actions(driver);
        actions.click(searchBox).pause(2000)
                .keyDown(Keys.SHIFT)
                .sendKeys("typing by holding down to shift").pause(2000)
                .keyUp(Keys.SHIFT)
                .sendKeys("typing after releasing shift").pause(2000)
                .keyDown(Keys.COMMAND).sendKeys("A").pause(2000) // mac
//                .keyDown(Keys.CONTROL).sendKeys("A") // windows
                .keyUp(Keys.COMMAND)   // .keyUp(Keys.CONTROL) // for windows
                .sendKeys(Keys.BACK_SPACE)
                .perform();

        Thread.sleep(3000);


    }
    @Test
    public void testRightClick() throws InterruptedException{
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");

        // locate the div element inside iframe
        // with css selector and right click on it
        driver.switchTo().frame("iframeResult") ;
        WebElement area = driver.findElement(By.cssSelector("div[contextmenu='mymenu']")) ;

        // right click -> context click
        Actions actions = new Actions(driver);
        actions.contextClick(area).perform();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(1000);
    }

    @Test
    public void testDoubleClick() throws InterruptedException{

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        driver.switchTo().frame("iframeResult");
        // Double-click this paragraph to trigger a function.
        WebElement pElm = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.doubleClick(pElm).perform();
        // assert new p element with Hello World text displayed
        WebElement resultElm = driver.findElement(By.xpath("//p[.='Hello World']")) ;
        assertTrue(resultElm.isDisplayed() );
        Thread.sleep(2000);
    }

}

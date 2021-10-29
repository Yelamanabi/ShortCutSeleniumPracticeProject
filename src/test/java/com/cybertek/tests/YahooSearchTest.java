package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest {
    WebDriver driver;

    @BeforeAll
    public static void initBrowserDriver(){
        System.out.println("@Before All run only once before all test");

    }
    @BeforeEach
    public void setupWebDriver(){
        System.out.println("@Before each to open browser and navigate ");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");
    }

    @AfterEach
    public void closeBrowser(){
        System.out.println("@AfterEach method is closing browser");
        driver.quit();
    }


    @Test
    public void testYahooSearchHomePage(){
        System.out.println("testYahooSearchHomePage is running");

        String expectedTitle  = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        //assertions
        assertEquals(expectedTitle,actualTitle);


    }

    @Test
    public void testYahooSearchResultPage(){
        System.out.println("testYahooSearchResultPage is running");



        //search for selenium and hit enter
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("selenium" + Keys.ENTER);

        //assert the title starts with selenium
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.startsWith("selenium"));


    }
}

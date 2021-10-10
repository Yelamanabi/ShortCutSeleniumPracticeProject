package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P20_LocateElementByCssSelector_FormTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to yahoo
        driver.get("http://practice.cybertekschool.com/registration_form");

        //locate elements using css selector
        //<input type="text"
        // class="form-control"
        // name="firstname"
        // placeholder="first name" data-bv-field="firstname">

        WebElement firstnameFiled = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstnameFiled.sendKeys("Adam");

        //<input type="text" class="form-control" name="lastname" placeholder="last name" data-bv-field="lastname">
        WebElement lastnameFiled = driver.findElement(By.cssSelector("input[data-bv-field='lastname']"));
        lastnameFiled.sendKeys("Jones");

        WebElement usernameFiled = driver.findElement(By.cssSelector("input[name='username']"));
        usernameFiled.sendKeys("adamjones");

        WebElement emailFiled = driver.findElement(By.cssSelector("input[name='email']"));
        emailFiled.sendKeys("someamr@gmail.com");

        WebElement passwordFiled = driver.findElement(By.cssSelector("input[name='password'][type='password']"));
        passwordFiled.sendKeys("top seretthere ");
        //<input type="tel" class="form-control" name="phone" placeholder="571-000-0000" data-bv-field="phone">
        WebElement phoneFiled = driver.findElement(By.cssSelector("input[name='phone'][type='tel']"));
        phoneFiled.sendKeys("347-905-3322");

        //<input type="radio" name="gender" value="male" data-bv-field="gender">
        WebElement genderRadioBtn = driver.findElement(By.cssSelector("input[name='gender'][value='male']"));
        genderRadioBtn.click();




        //<input type="text" class="form-control" name="birthday" placeholder="MM/DD/YYYY" data-bv-field="birthday">

        WebElement birthdayFiled = driver.findElement(By.cssSelector("input[name='birthday']"));
        birthdayFiled.sendKeys("01/01/2000");

        WebElement dropdownElm = driver.findElement(By.cssSelector("select[name='department']"));
        Select depSelectObj = new Select(dropdownElm);
        depSelectObj.selectByIndex(2);

        WebElement titleDropDownElm = driver.findElement(By.cssSelector("select[name='job_title']"));
        Select titleSelectObj = new Select(titleDropDownElm);
        titleSelectObj.selectByIndex(3);

        WebElement checkBox1 = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        checkBox1.click();


        WebElement signupBtn = driver.findElement(By.cssSelector("#wooden_spoon"));
        signupBtn.click();



    }
}

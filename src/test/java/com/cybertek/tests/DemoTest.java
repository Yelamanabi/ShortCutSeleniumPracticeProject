package com.cybertek.tests;

import org.junit.jupiter.api.*;

public class DemoTest {
    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll run once before all test ");
    }
    @AfterAll
    public static  void cleanup(){
        System.out.println("@AfterAll run once after all test");
    }

    @BeforeEach
    public void setup(){
        System.out.println("@BeforeEach run before each test");
    }
    @AfterEach
    public void teardown(){
        System.out.println("@AfterEach run after each test");

    }

    @Test
    public void test1(){
        System.out.println("test1 is running");
    }

    @Test
    public void test2(){
        System.out.println("test2 is running ");
    }
}

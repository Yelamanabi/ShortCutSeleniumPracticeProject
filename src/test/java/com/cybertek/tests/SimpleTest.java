package com.cybertek.tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    public void testAddition(){


        System.out.println("Hello World testAddition");
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        assertEquals(expectedResult, num1+num2);



        }
        @Test
        public void testString(){
            System.out.println("message from testString ");
        String name = "Junit";
        assertEquals("Junit", name);


        }
    }


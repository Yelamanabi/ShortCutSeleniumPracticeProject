package com.cybertek.tests;

import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;

public class P35_SingletonDriver_Test {

    @Test
    public  void testDriverUtility(){

        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
    }
}

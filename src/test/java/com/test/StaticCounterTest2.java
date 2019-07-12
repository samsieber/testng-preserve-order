package com.test;

import org.testng.annotations.Test;

public class StaticCounterTest2 {
    @Test
    public void testSecond(){
        StaticCounter.value += 1;
        org.testng.Assert.assertEquals(StaticCounter.value, 1);
    }
}
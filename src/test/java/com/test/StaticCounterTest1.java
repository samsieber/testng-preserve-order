package com.test;

import org.testng.annotations.Test;

public class StaticCounterTest1 {
    @Test
    public void testFirst(){
        StaticCounter.value += 1;
        org.testng.Assert.assertEquals(StaticCounter.value, 1);
    }
}
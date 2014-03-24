package com.genericgames;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleTest {

    private Sample sampleClass;

    @Before
    public void setup(){
        sampleClass = new Sample();
    }

    @Test
    public void testIsTrue() throws Exception {
        assertTrue(sampleClass.isTrue());
    }

    @Test
    public void testNumberOne() throws Exception {
        assertEquals("Number doesn't match one", 1, sampleClass.numberOne());
    }

}

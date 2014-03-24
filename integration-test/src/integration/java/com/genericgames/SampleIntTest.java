package com.genericgames;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleIntTest {

    SampleInt sampleIntegrationClass;
    @Before
    public void setup(){
        sampleIntegrationClass = new SampleInt();
    }

    @Test
    public void testIsTrue() throws Exception {
        assertTrue(sampleIntegrationClass.isTrue());
    }

    @Test
    public void testNumberOne() throws Exception {
        assertEquals("Number doesn't match one", 1, sampleIntegrationClass.numberOne());
    }
}

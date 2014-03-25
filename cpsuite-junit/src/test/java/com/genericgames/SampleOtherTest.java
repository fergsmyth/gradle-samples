package com.genericgames;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleOtherTest {

    private Sample sample = new Sample();

    @org.junit.Before
    public void setUp() throws Exception {
        sample = new Sample();
    }

    @Test
    public void testIsTrue(){
        assertTrue(!sample.isTrue());
    }
}

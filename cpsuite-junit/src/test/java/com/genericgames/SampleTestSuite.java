package com.genericgames;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters({"mytests.*", ".*Test"})
public class SampleTestSuite {

}

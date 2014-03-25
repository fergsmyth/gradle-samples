package com.genericgames;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

import static org.junit.extensions.cpsuite.ClasspathSuite.SuiteTypes;
import static org.junit.extensions.cpsuite.SuiteType.TEST_CLASSES;

@RunWith(ClasspathSuite.class)
@SuiteTypes(TEST_CLASSES)
//@ClasspathSuite.ClassnameFilters({".*OtherTest"})
@ClasspathSuite.ClassnameFilters({"!.*OtherTest"})
public class SampleTestSuite {

}

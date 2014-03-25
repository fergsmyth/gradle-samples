Running unit tests with gradle using CPSuite classpath extensions.

In this project: 
	
The test suite to run is specified as an include for the test task provided by the Java plugin.

A separate maven repository is used to retrieve the cpsuite dependency which is not held in maven central.

SampleTestSuite specifies the classname filter to use to identify which tests should be run. A second commented out filter includes only the SampleOtherTest class. This is a failing test to show that the filter is working.

*Note*

1. Specifying an test include automatically sets scanForTestClasses to false.

2. Filters work by first finding all included test classes and then applying the exclude filters to that set.

3. The SuiteTypes annotation is used to decide whether other test suites should be included in the classes to run.



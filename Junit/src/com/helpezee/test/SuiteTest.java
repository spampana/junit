package com.helpezee.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//The "Suite Test" means bundle a few unit test cases and run it together. In Junit, both @RunWith and @Suite annotation are used to run the suite test.
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BasicTest.class,
	ExpectedTest.class
	
})
public class SuiteTest {

}

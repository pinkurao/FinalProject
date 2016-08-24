package com.nlsinc.java.FirstMavenProject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Cal2Test.class, CalculatorTest.class })
public class CalAllTests {
    
}

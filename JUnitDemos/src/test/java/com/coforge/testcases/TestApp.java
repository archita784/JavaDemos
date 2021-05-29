package com.coforge.testcases;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.coforge.testcases"})
//@SelectClasses({StudentTest.class,CalculatorTest.class})

class TestApp {

	
}

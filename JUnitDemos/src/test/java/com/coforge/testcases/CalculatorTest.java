package com.coforge.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.coforge.training.Calculator;

class CalculatorTest {

	Calculator calc;
	@BeforeAll
	static void init() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void cleanUp() throws Exception {
		System.out.println("called before all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calc=new Calculator();
				
		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
		System.out.println("called after each testcases");
	}

	@Test
	@Tag("Addition")
	@DisplayName("testing add method")
	void testAdd() {
		double result =calc.add(10,20);
	assertEquals(30,result,"sum should be 30");
	
	}
	@Test
	//@Disabled
	@DisplayName("testing difference method")
	void testDiffer() {
		double result =calc.differ(100,20);
	assertEquals(80,result,"difference should be 80");
	
	}
	@Test
	void testProduct() {
		double result=calc.product(2, 4);
		assertEquals(8,result,"product should be 8");
			
	}
	
}

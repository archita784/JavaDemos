package com.coforge.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.coforge.Exceptions.GreatorValueException;
import com.coforge.training.Student;

class StudentTest {
	Student std;

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
		std = new Student();

		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		std = null;
		System.out.println("called after each testcases");
	}

	@Test
	@DisplayName("testing sum of marks")
	void testSum() throws GreatorValueException {
		double result = std.sum(80, 78, 62);
		assertEquals(220, result, "sum should be 220");

	}

	@Test
	@DisplayName("testing for negative value")
	void testNegvalue() throws GreatorValueException {
		assertEquals(0, std.sum(-90, 80, 70));

	}

	@Test
	@DisplayName("testing for greator then 100 value")
	void testGreator() throws GreatorValueException {
		
		assertThrows(GreatorValueException.class, () -> {
			System.out.println(std.sum(190, 80, 90));
		},"exception!!!");
	}

}

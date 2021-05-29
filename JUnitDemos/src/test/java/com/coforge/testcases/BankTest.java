package com.coforge.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.coforge.exception.NegativeValueException;
import com.coforge.trial.Bank;

class BankTest {
 Bank bank;
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
		bank = new Bank();

		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
		System.out.println("called after each testcases");
	}

	@Test
	@DisplayName("testing proper value")
	void testProperValue() throws NegativeValueException {
		
		assertThrows(NegativeValueException.class, () -> {
			System.out.println(bank.withdraw(800));
		},"exception!!!");}

	
	
}

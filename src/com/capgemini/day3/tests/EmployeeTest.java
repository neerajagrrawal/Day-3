package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.*;

class EmployeeTest {

	Employee e1;

	@BeforeEach
	void setUp() {
		e1 = new Employee(100,"Rahul",300000,1000);
	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(414800.0, e1.calculateNetSalary(), 0.02);
	}


	@AfterEach
	void tearDown() {
		e1 = null;
	}
}
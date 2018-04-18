package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactorialTest {
Factorial f;
	@BeforeEach
	void setUp() throws Exception {
	f = new Factorial();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		//Arrange
		
		//Set
		boolean actualValue = f.findFactorial32bit(23);
		//Assert
        assertFalse(false);	
	}
	@Test
	void test2() {
		//Arrange
		
		//Set
		boolean actualValue = f.findFactorial64bit(23);
		//Assert
        assertFalse(false);	
	
}
}
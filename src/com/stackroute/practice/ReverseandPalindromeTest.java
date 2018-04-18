package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ReverseandPalindromeTest {

	ReverseandPalindrome rp;
	
	@BeforeEach
	void setUp() throws Exception {
		ReverseandPalindrome rp = new ReverseandPalindrome();
	}

	


	@Test
	void validatePalindromeString() {
		//Arrange
		String expectedValue = "acbca";
		//Set
		String actualValue = rp.reserveInput("acbca");
		//Assert
        assertEquals(expectedValue, actualValue, "Value has failed");	
	}

	@Test
	void validatePalindromeNumber() {
		//Arrange
		String expectedValue = "787";
		//Set
		String actualValue = rp.reserveInput(787);
		//Assert
        assertEquals(expectedValue, actualValue);	
	}
	@AfterEach
	void tearDown() throws Exception {
		ReverseandPalindrome rp = null;
}
}
package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberTest {
	MemberVariable mv; 
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//Arrange
		String expectedName = "Harry Potter";
		int expectedAge = 23;
		double expectedSalary = 2500.3;
		
		//Act
		mv = new MemberVariable(expectedName, expectedAge,expectedSalary);
		
		//Assert
	    assertEquals(expectedName,mv.getMember().getName());
	    assertEquals(expectedAge,mv.getMember().getAge());
	    assertEquals(expectedSalary,mv.getMember().getSalary());
	
	}

}

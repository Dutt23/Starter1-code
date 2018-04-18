package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentsTest {
Students s;
	@BeforeEach
	void setUp() throws Exception {
		s = new Students();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
	void testValidateInput() {
		//Arrange
		boolean expectedValue = false;
		//Set
		boolean actualValue = s.checkInput(4);
		//Assert
	   assertEquals(expectedValue,actualValue);
	}

@Test
void testValidateArrayInput() {
	//Arrange
	boolean expectedValue = false;
	//Set
	boolean actualValue = s.enterStudentDetails(4);
	//Assert
	assertEquals(expectedValue,actualValue);
}

@Test
void testValidateArray() {
	//Arrange
	boolean expectedValue = false;
	//Set
	boolean actualValue = s.enterStudentDetails(4);
	//Assert
	assertEquals(expectedValue,actualValue);
}



@Test
void testValidateGrades() {
	int [] a = {45,67,78,89};
	//Arrange
	boolean expectedValue = false;
	//Set
	boolean actualValue = s.checkGrades(a);
	//Assert
	assertEquals(expectedValue,actualValue);
}
@Test
void testValidateAverage() {
	int [] a = {45,67,78,89};
	//Arrange
	int expectedValue = 279;
	//Set
	int actualValue = s.findAverage(a);
	//Assert
	assertEquals(expectedValue,actualValue);
}
@Test
void testValidateMax() {
	int [] a = {45,67,78,89};
	//Arrange
	int expectedValue = 89;
	//Set
	int actualValue = s.findMax(a);
	//Assert
	assertEquals(expectedValue,actualValue);
}
@Test
void testValidateMin() {
	int [] a = {45,67,78,89};
	//Arrange
	int expectedValue = 45;
	//Set
	int actualValue = s.findMin(a);
	//Assert
	assertEquals(expectedValue,actualValue);
}
}

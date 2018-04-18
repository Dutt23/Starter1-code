package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReadingofFileTest {

	ReadingofFile rf ;
	
	@BeforeEach
	void setUp()  {
	rf = new ReadingofFile();
	}

	@AfterEach
	void tearDown()  {
	}

	@Test
	void ifFileRead() throws IOException   {
		//Arrange
		boolean expectedValue = false;
		//Act
		boolean actualValue = rf.readFile();
		//Assert
	    assertFalse(actualValue);
	}
	@Test
	void convertToUpperCase()   {
		//Arrange
		String expectedValue = "HELLO WORLD";
		//Act
		String actualValue = rf.convertUppercase("hello world");
		//Assert
	    assertEquals(expectedValue,actualValue);
	}
	@Test
	void checkLength()   {
		//Arrange
		int expectedValue = 5;
		//Act
		int actualValue = rf.length("hello");
		//Assert
	    assertEquals(expectedValue,actualValue);
	}

}

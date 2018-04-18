package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {
File f;
	@BeforeEach
	void setUp() throws Exception {
	
	f = new File();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValidateifFileFound() {
		//Arrange
		boolean expectedValue = false;
		//Set
		boolean actualValue = f.findFile();
		//Assert
       assertEquals(expectedValue,actualValue);	
	}

}

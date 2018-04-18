package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrequencyofWordsTest {

	FrequencyofWords fq;
	@BeforeEach
	void setUp() throws Exception {
	fq = new FrequencyofWords();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValidateifFileread() throws IOException {
		
		String path = "/home/shatayki/javaworkspace/Agile/src/com/stackroute/practice";
		//Arrange
		boolean expectedValue = false;
		//Set
		boolean actualValue = fq.readFile(path);
		//Assert
	    assertEquals(expectedValue,actualValue);
	}


	@Test
	void testValidateFrequency() {
		//Arrange
		boolean expectedValue = false;
		//Set
		boolean actualValue = fq.letterFrequency("Hello I am ");
		//Assert
	    assertEquals(expectedValue,actualValue);
	}

}

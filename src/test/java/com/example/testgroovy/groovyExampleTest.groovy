package com.example.testgroovy

import static org.junit.Assert.*
import junit.framework.Assert

import org.junit.Test

class groovyExampleTest {

	@Test
	void validateFunctionPLus(){
		Assert.assertEquals(2+2, 4)
	}
}

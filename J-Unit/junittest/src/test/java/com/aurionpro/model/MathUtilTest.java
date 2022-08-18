package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


	@TestInstance(Lifecycle.PER_CLASS)
public class MathUtilTest {
	
	MathUtil util;
	
	@Disabled
	@Test
	void test(){
//		System.out.println("testing junit");
		fail("this test is failed!!!!!");
	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("before Testing");
	}
	
	@BeforeEach
	void beforeEach() {
		util = new MathUtil();
		System.out.println("before Each Testing");
	}
	
	@Test
	@DisplayName(value = "check addition of postive integer")
	void testAddNumbers_checkPositiveInteger() {
		
		int expected =10;
		int actual = util.addNumbers(5, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddNumbers_checkPositiveIntegerAndZero() {
		int expected =5;
		int actual = util.addNumbers(5, 0);
		assertEquals(expected, actual);
		
	}
	@Test
	void testAddNumbers_checkNegativeInteger() {
		int expected =-10;
		int actual = util.addNumbers(-5, -5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testAddNumbers_checkDevisionByPositiveNumber() {
		int expected =5;
		int actual = util.divideNumber(10, 2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testDevideNumbers_checkDevisionByNegativeNumber() {
		int expected =-5;
		int actual = util.divideNumber(10, -2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testDevideNumbers_checkDevisionByZero() {
		int expected =-10;
		int actual = util.divideNumber(100, -10);
		//assertEquals(expected, actual);
		assertTrue(expected==actual);
		
	}
	
	@Test
	void testDevideNumbers_checkArithmaticException() {
		assertThrows(ArithmeticException.class, ()->util.divideNumber(10, 0));
	}
	
	@Test
	void testEqualArrays() {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		assertArrayEquals(arr, arr2);
	}
	
}

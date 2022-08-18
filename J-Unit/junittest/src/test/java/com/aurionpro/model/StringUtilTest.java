package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class StringUtilTest {
	
	StringUtil util = new StringUtil();
	
	@Test
	void testTruncateAInFirst2Place() {
		String expected ="bcd";
		String actual = util.truncateAInFirst2Place("Abcd");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTruncateAInFirst2Place1() {
		String expected ="bcd";
		String actual = util.truncateAInFirst2Place("AAbcd");
		assertEquals(expected, actual);
	}
	@Test
	void testTruncateAInFirst2Place3() {
		String expected ="bcdAA";
		String actual = util.truncateAInFirst2Place("bcdAA");
		assertEquals(expected, actual);
	}
	@Test
	void testTruncateAInFirst2Place4() {
		String expected ="Abcd";
		String actual = util.truncateAInFirst2Place("AaAbcd");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTruncateAInFirst2Place4_onlyTwoChar() {
		String expected ="";
		String actual = util.truncateAInFirst2Place("Aa");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual() {
		boolean expected =true;
		String s = "AAbAA";
		boolean actual = util.firstAndLastTwoCharAreEqual(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual_withIgnoringCase() {
		boolean expected =true;
		String s = "AAbAa";
		boolean actual = util.firstAndLastTwoCharAreEqual(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual_ifSequenceIsNotSame() {
		boolean expected =false;
		String s = "ABBBA";
		boolean actual = util.firstAndLastTwoCharAreEqual(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual_ifLengthIsLessThan4() {
		boolean expected =false;
		String s = "AAA";
		boolean actual = util.firstAndLastTwoCharAreEqual(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFirstAndLastTwoCharAreEqual_ifEmpty() {
		boolean expected =false;
		String s = "    ";
		boolean actual = util.firstAndLastTwoCharAreEqual(s);
		assertEquals(expected, actual);
	}


}

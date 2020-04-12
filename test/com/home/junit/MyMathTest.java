package com.home.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	@BeforeAll
	public static void before() {
		System.out.println("BEFORE ALL");
	}
	
	@AfterAll
	public static void after() {
		System.out.println("AFTER ALL");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER CLASS");
	}
	
	@BeforeClass
	public static void beforeClass () {
		System.out.println("BEFORE AFTER CLASS");
	}
	
	
	@Test
	void sub_with3numbers() {
		System.out.println("TEST1");
		int result = myMath.sum(new int[] {1,2,3});
//		System.out.println(myMath.sum(new int[] {1,2,3}));
		//check ther ersults as 6
		assertEquals(6, result);
	}
	void sub_with1numbers() {
		System.out.println("TEST2");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1});
//		System.out.println(myMath.sum(new int[] {1,2,3}));
		//check ther ersults as 6
		assertEquals(1, result);
	}

}

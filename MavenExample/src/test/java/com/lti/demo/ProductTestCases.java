package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTestCases {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testCompanyName() {
		Product p= new Product(101,"mob",20000);
		Assertions.assertEquals("DMART",p.getCompanyName());
	}

}

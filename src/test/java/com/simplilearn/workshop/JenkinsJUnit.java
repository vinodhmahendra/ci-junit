package com.simplilearn.workshop;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JenkinsJUnit {

	@Test
	public void testCasePassed() {
		int a = 1;
		int b = 2;
		Assert.assertTrue(a + b == 3);
	}

	@Test
	public void testCaseFailed() {
		int a = 2;
		int b = 2;
		Assert.assertTrue(a + b == 4);
	}

	@Ignore
	@Test
	public void testCaseIgnored() {
		fail("this test fail");
	}

}

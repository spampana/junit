package com.helpezee.test;

import org.junit.Test;

public class ExpectedTest {

@Test(expected = ArithmeticException.class)
public void TestException()
{
	int a= 1/0;
}
}

package com.helpezee.test;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {
	
	@Ignore("Not Ready to Run")  
	@Test
	public void divisionWithException1() {  
	  System.out.println("Method is not ready yet");
	}  
	
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is ready ");
	}  
}

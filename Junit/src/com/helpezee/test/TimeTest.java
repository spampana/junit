package com.helpezee.test;

import org.junit.Test;

//The "Time Test" means if an unit test takes longer than the specified number of milliseconds to run, the test will terminated and mark as failed.
public class TimeTest {

		 
		@Test(timeout= 1000)  
		public void infinity() {  
			while (true);  
		}  

}
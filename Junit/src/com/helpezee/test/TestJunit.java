package com.helpezee.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test
   public void testAdd() {
      String str= "Junit is working fine1";
      assertEquals("Junit is working fine",str);
   }
}
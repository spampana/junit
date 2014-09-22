package com.helpezee.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicTest {

private Collection collection;	
	
@BeforeClass
public  static void printMessage1()
{
	System.out.println("Print Before Class");
}
@AfterClass
public  static void printMessage2()
{
	System.out.println("Print After Class");
}

@Before
public void StartUpconfigure()
{
	collection = new ArrayList<String>();
	System.out.println("Runs Before every Test Method");
}

@After
public void Closeconfigure()
{
	System.out.println("Runs After Every Test Method");
}

@Test
public void testIsEmpty()
{
	assertTrue(collection.isEmpty());
}

@Test
public void testOneItemCollection() {
    collection.add("itemA");
    assertEquals(1, collection.size());
}


}

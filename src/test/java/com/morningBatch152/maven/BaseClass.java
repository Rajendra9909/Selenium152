package com.morningBatch152.maven;

import org.testng.annotations.BeforeSuite;
public class BaseClass {
	
	@BeforeSuite
	
	public void beforeSuite()
	{
		
		System.out.println("This is before suite method");
	}

}

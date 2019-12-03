package com.mmt.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class ProjectPage extends BasePage {
	
	@BeforeSuite
	public void beforeSuite() {
		readConfig();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		invokeApp();
	}
	
	@AfterClass
	public void afterClass() {
		tearDown();
		
	}

	
	
}

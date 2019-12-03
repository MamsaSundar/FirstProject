package com.mmt.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mmt.pages.HomePage;

public class TC001_SearchFlights extends HomePage{

	public TC001_SearchFlights(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void searchFlights() {
		HomePage home = new HomePage(driver);
		home.fromPlace("Chennai");
		home.toPlace("Mumbai");
		home.clickSearch();


		
		
	}
}

package com.mmt.pages;

import org.openqa.selenium.WebDriver;
import com.mmt.base.ProjectPage;

public class HomePage extends ProjectPage{
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void fromPlace(String fromPlaceNm) {
		clickElement(OR.getProperty("Home.fromBox.XPATH"));
		sendText(OR.getProperty("Home.fromCity.XPATH"), fromPlaceNm);
		clickElement(OR.getProperty("Home.fromInput.XPATH"));
		
	}
	
	public void toPlace(String toPlaceNm) {
		clickElement(OR.getProperty("Home.fromBox.XPATH"));
		sendText(OR.getProperty("Home.fromCity.XPATH"), toPlaceNm);
		clickElement(OR.getProperty("Home.fromInput.XPATH"));
	}
	
	public void selectDepDate(String depDate) {
		
	}
	
	public void selectReturnDate(String retDate) {
		
	}
	
	public void clickSearch() {
	clickElement(OR.getProperty("Home.btnSearch.XPATH"));	
	}

}

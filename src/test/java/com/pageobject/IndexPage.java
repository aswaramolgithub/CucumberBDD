package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	//create object of webdriver
	WebDriver ldriver;

	public IndexPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//identify webelement
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	WebElement enterMobile ;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	WebElement otp ;
	
	//identify action on webelement
	public void clickOnLogin() {
		login.click();
	}
	
	public void enterMobileNumber() {
		enterMobile.sendKeys("9923190015");
	}
	
	public void clickOTP() {
		otp.click();
	}
}



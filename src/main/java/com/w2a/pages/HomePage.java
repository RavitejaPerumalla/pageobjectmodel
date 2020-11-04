package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goToCustomers() {
		
		driver.findElement(By.cssSelector(".zh-customers")).click();
	}
	
	public void goToSupport() {
		
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void goToContactSales() {
		
		driver.findElement(By.cssSelector(".zh-contact")).click();
	}
	
	public LoginPage goToLogin() throws IOException {
		
		click("loginlink_CSS");
		
		return new LoginPage();
	}
	
	public void goToFreeSignUp() {
		
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public void validateFooterLinks() {
		
		
	}

}

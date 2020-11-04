package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	public ZohoAppPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goToBooks() {
		
		driver.findElement(By.cssSelector("#zl-myapps > div.ea-app-container > div:nth-child(6) > div > a > span")).click();
		
	}

	public CRMHomePage goToCRM() {
		
		click("crmlink_CSS");
		
		return new CRMHomePage();
	}
	
	public void goToInvoice() {
		
		driver.findElement(By.cssSelector("#zl-myapps > div.ea-app-container > div:nth-child(9) > div > a > div")).click();
	}
}

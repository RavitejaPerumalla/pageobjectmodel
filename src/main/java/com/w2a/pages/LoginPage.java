package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import com.w2a.base.Page;

public class LoginPage extends Page {
	


	
	public LoginPage() throws IOException {
		super();
		
	}

	public ZohoAppPage doLogin(String username,String password) throws InterruptedException, IOException {
		
	
		type("email_CSS",username);
		click("nextbtn_CSS");
		Thread.sleep(2000);
		type("password_CSS",password);
		click("signinbtn_CSS");
		
		return new ZohoAppPage();
	}
	
	
}

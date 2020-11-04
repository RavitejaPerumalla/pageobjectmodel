package com.w2a.pages.crm.accounts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	public AccountsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateAccountPage goToCreateAccounts() throws IOException {
		
	
		click("createaccountbtn_CSS");
		
		return  new CreateAccountPage();
	}
	
	public void goToImportAccounts() {
		
		
	}

}

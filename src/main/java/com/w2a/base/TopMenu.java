package com.w2a.base;

import java.io.IOException;

import org.openqa.selenium.By;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() throws IOException {

		Page.click("accountstab_LINKTEXT");
		
		return new AccountsPage();
	}

	

	public void goToDeals() {

	}

	public void goToActivities() {

	}
	
    public void signOut() {
		
		
	}

}

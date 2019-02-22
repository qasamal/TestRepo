package com.quora.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QuoraFlow extends BusinessFlow {

	@BeforeTest
	public void loginToQuora() throws Exception {

		// initiate the browser
		launchBrowser();
		// login
		searchFlights();

	}

	@Test
	public void probes() throws Exception {
		// print text
		getText();

	}

	@AfterTest
	public void closingBrowser() {
		//close all browser windows
		closeallBrowsers();

	}

}

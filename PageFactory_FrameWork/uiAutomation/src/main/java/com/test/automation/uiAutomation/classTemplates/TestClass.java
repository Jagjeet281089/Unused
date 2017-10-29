package com.test.automation.uiAutomation.classTemplates;


import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.RegisterPage;

public class TestClass extends TestBase {
	RegisterPage registerPage;
	
	
	@BeforeTest
	public void setup() throws IOException {
		init();
	}

	@Test
	public void testName() {
		registerPage = new RegisterPage(driver);
		
		log("----------------Starting Test TC003_testName----------------");
		
		log("----------------Completed Test TC003_testName----------------");
	
	}

	@AfterTest
	public void endTest() {
		end();
	}

	public void log(String data) {
		log.info(data);
		Reporter.log(data);
	}

}

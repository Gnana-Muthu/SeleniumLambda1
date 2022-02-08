package com.mindtree.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.mindtree.Pageobject.TestScenario1;
import com.mindtree.Reusable.Reusablecomponent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestScenario2StepDefinition extends Reusablecomponent {
	
WebDriver driver;
	@Given("^Initilaise Browser$")
	public void initilaise_Browser() throws Throwable {
		driver=setup();
		
	   
	}

	@Then("^Navigate tho Travolook website$")
	public void navigate_tho_Travolook_website() throws Throwable {
		driver.get("https://www.lambdatest.com/selenium-playground/");
		TestScenario1 fs=new TestScenario1(driver);
	    fs.ValidateURL();
	}

	@Then("^Enter From and To$")
	public void enter_From_and_To() throws Throwable {
	 /*   FlightSearch fs=new FlightSearch(driver);
	    fs.From();
	    Thread.sleep(3000);
	    fs.From1();
	    Thread.sleep(3000);
	    fs.To();
	    Thread.sleep(3000);
	    fs.To1();
	    Thread.sleep(3000);*/
	    System.out.println("Hello");
	}

	@Then("^Click Depature$")
	public void click_Depature() throws Throwable {
		/* FlightSearch fs=new FlightSearch(driver);
		 fs.Depature();
		 Thread.sleep(3000);*/
		  System.out.println("Hello");
	}

	@Then("^Click Traveler$")
	public void click_Traveler() throws Throwable {
		/* FlightSearch fs=new FlightSearch(driver);
		 fs.Traveller();
		 Thread.sleep(3000);
		 fs.Done();
		 Thread.sleep(3000);*/
		  System.out.println("Hello");
	}

	@Then("^Click Search$")
	public void click_Search() throws Throwable {
		/* FlightSearch fs=new FlightSearch(driver);
		 fs.Search();*/
		  System.out.println("Hello");
	}

	
	
	

}

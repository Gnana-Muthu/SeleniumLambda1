package com.mindtree.Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import com.mindtree.UiStore.TestScenario3Ui;


public class TestScenario3 extends TestScenario3Ui {
public WebDriver driver;
	
	public TestScenario3(WebDriver driver)
	{
		this.driver=driver;
	}

	public void ValidateSubmit() throws InterruptedException
    {
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1070888\\Documents\\SOUPUI\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
		WebElement ButtonClick=driver.findElement(Button);
		ButtonClick.click();
		}
	catch(Exception e)
		{
			//System.out.println("cannot able to From");
			
		}
		
    }
	public void EnterName()
    {
		try
		{

			WebElement Firstname=driver.findElement(Firstnameenter);
			Firstname.sendKeys("GnanaMuthu");
		}
		catch(Exception e)
		{
			System.out.println("Name is not entered");
			
		}
		
    }
	public void EnterMailPassword()
    {
		try
		{

			WebElement Email=driver.findElement(Emailid);
			Email.sendKeys("gnanamuthupam@gmail.com");
			WebElement Password=driver.findElement(Pass);
			Password.sendKeys("muthuGMAHA0810");

		}
		catch(Exception e)
		{
			System.out.println("Email or Password is not entered");
			
		}
		
    }
	public void CompanyNamemaildetails()
    {
		try
		{

			WebElement company=driver.findElement(Companyui);
			company.sendKeys("Mindtree");
			WebElement companyaddress=driver.findElement(CompanyaddressUi);
			companyaddress.sendKeys("gnanamuthugmg@gmail.com");
		}
		catch(Exception e)
		{
			System.out.println("CompanyNamemaildetails is not entered");
			
		}
		
    }
	public void CountryCity()
    {
		try
		{

			WebElement country=driver.findElement(Countryui);
			country.click();
			WebElement city=driver.findElement(Cityui);
			city.sendKeys("California");
		}
		catch(Exception e)
		{
			System.out.println("CountryCity is not entered");
			
		}
		
    }
	public void Address()
    {
		try
		{

			WebElement Address1=driver.findElement(Address1Ui);
			Address1.sendKeys("xyz");
			WebElement Address2=driver.findElement(AddressUi2);
			Address2.sendKeys("xyz");
		}
		catch(Exception e)
		{
			System.out.println("Address is not entered");
			
		}
		
    }
	public void StateZip()
    {
		try
		{

			
			WebElement State=driver.findElement(StateUi);
			State.sendKeys("America");
			WebElement Zip=driver.findElement(Zipui);
			Zip.sendKeys("12345");
			
		}
		catch(Exception e)
		{
			System.out.println("StateZip is not entered");
			
		}
		
    }
	public void Submit()
    {
		try
		{

			WebElement ButtonClick=driver.findElement(Button);
			ButtonClick.click();
		}
		catch(Exception e)
		{
			System.out.println("Not Submited");
			
		}
		
    }
}

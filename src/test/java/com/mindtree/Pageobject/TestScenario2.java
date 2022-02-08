package com.mindtree.Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import com.mindtree.UiStore.TestScenario1Ui;


public class TestScenario2 extends TestScenario1Ui {
public WebDriver driver;
	
	public TestScenario2(WebDriver driver)
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
		WebElement Button=driver.findElement(By.xpath("//button[text()='Submit']"));
		Button.click();
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

			WebElement Firstname=driver.findElement(By.id("name"));
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

			WebElement Email=driver.findElement(By.id("inputEmail4"));
			Email.sendKeys("gnanamuthupam@gmail.com");
			WebElement Password=driver.findElement(By.id("inputPassword4"));
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

			WebElement company=driver.findElement(By.id("company"));
			company.sendKeys("Mindtree");
			WebElement companyaddress=driver.findElement(By.id("websitename"));
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

			WebElement country=driver.findElement(By.xpath("//select[name='country']"));
			country.click();
			WebElement city=driver.findElement(By.id("inputCity"));
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

			WebElement Address1=driver.findElement(By.id("inputAddress1"));
			Address1.sendKeys("xyz");
			WebElement Address2=driver.findElement(By.id("inputAddress2"));
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

			
			WebElement State=driver.findElement(By.id("inputState"));
			State.sendKeys("America");
			WebElement Zip=driver.findElement(By.id("inputZip"));
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

			WebElement Button=driver.findElement(By.xpath("//button[text='Submit']"));
			Button.sendKeys("America");
		}
		catch(Exception e)
		{
			System.out.println("Not Submited");
			
		}
		
    }
}

package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods{
	@DataProvider(name = "create")
	public String[][] fetchData() throws IOException {

		String[][] data = ReadData.readData();
		return data;
	}

	@Test(dataProvider="create")
	public void cL(String company, String first, String last) {

		//Click on CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Lead tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Click on company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		//Click on first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		//Click on last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		//Dropdown
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Direct Mail");
		//Click on create lead
		driver.findElement(By.name("submitButton")).click();
		//To get title
		System.out.println(driver.getTitle());






	}



}

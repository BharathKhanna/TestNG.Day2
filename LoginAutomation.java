package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation extends ProjectSpecificMethods{
    @Test
	public void logIn() {
		
		//Finally, we need to check if we are in correct page
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		//Get the attribute and print
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout")) {
			System.out.println("Successfully Logged In");
		}

		


	}

}

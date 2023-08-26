package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	ChromeDriver driver;
    @Parameters({"url","username","password"})
	@BeforeMethod
	public void setup(String url, String username, String password) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		driver = new ChromeDriver(co);
		//Load the URL
		driver.get(url);
		//Maximize the browser
		driver.manage().window().maximize();
		//Find the username and enter username value
		driver.findElement(By.id("username")).sendKeys(username);
		//Find the password field and enter password
		driver.findElement(By.id("password")).sendKeys(password);
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();

}

}

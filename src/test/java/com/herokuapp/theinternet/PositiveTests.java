package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {

	@Test
	public void loginTest() {
		System.out.println("Starting loginTest");
		//Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened.");

		//maximize browser window
		driver.manage().window().maximize();
		
		//enter username
		WebElement username = driver.findElement(By.id("username"));
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));

		//click login button
		WebElement logInButton = driver.findElement(By.tagName("button"));
		
		//verifications:
		//new url
		//logout button is visible
		//successful login message

		//close browser
		driver.quit();
	}

}

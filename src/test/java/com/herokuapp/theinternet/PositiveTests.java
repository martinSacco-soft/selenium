package com.herokuapp.theinternet;

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
		
		
		//enter password
		//click login button
		
		//verificatins:
		//new url
		//logout button is visible
		//succesful login message

		//close browser
		driver.quit();
	}

}

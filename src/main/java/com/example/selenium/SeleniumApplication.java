package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumApplication {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("http://www.facebook.com");
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("usuario");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        chromeDriver.findElement(By.id("u_0_b")).click();



    }


}



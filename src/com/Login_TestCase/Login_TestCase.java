package com.Login_TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		String email = "example@gmail.com"; //Enter your Email ID 
		String password = "Example@Password"; // Enter your password

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		String url = driver.getCurrentUrl();
		String test_url = "https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit";
		if (url.equals(test_url))
		{
			System.out.println("Test Case Pass");
		}
		else;
		{
			System.out.println("Test Case Failed");
		}
		
	}
}
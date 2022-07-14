package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTasts {
	WebDriver driver;
	@Test(groups="Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		@Test(groups="Chrome", dependsOnMethods="LaunchChrome")
		public void TryFacebook1() {
			System.out.println(Thread.currentThread().getId());
			driver.findElement(By.id("email")).sendKeys("women.women@icloud.com");
			driver.findElement(By.id("pass")).sendKeys("Kunduza5");
			driver.findElement(By.name("login")).click();
		}
		
		@Test(groups="Firefox")
		public void LaunchFirefox() {
			System.setProperty("webdriver.gecko.driver", "Users/macbook/Downloads/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
		public void TryFacebook2() {
			System.out.println(Thread.currentThread().getId());
			driver.findElement(By.id("email")).sendKeys("women.women@icloud.com");
			driver.findElement(By.id("pass")).sendKeys("kunduza5");
			driver.findElement(By.id("loginbutton")).click();
			System.out.println(Thread.currentThread().getId());
		}
	}




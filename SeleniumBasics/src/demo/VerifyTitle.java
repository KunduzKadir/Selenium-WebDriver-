package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[]args) {
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		//Navigate to application
		driver.get("https://www.amazon.com/");
		//Verify user sees the title- Amazon.com.Spend less.Smile more.
		String expectedTitle = driver.getTitle();
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
			}
		else {
			System.out.println("Test Case Failed");
			
		}
		//Close the browser
		driver.quit();
		}
	

}

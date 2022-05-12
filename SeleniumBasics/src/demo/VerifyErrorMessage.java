package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[]args){
//Open the browser		
	ChromeDriver driver = new ChromeDriver();

	//Navigate to application
	driver.get("https://facebook.com");
	//Enter an invalid username-women.women@icloud.com
	driver.findElementById("email").sendKeys("women.women@icloud.com");
	//Enter an invalid password
	driver.findElementById("pass").sendKeys("Kunduza5");
	//Click on login button
	driver.findElementByName("login").click();
	//Verify the error message-invalid username or password-is desplayed
	String expectedErrorMessage ="Invalid username or password";
	String actualErrorMessage = driver.findElementByCssSelector("#error_box > div:nth-child(1)").getText();
	
	if(expectedErrorMessage.equals(actualErrorMessage)) {
		System.out.println("Test Case Passed");
	}
	else {
		System.out.println("Test Case Faild");
		
	}
	//Close the browser
	driver.quit();
	
}}

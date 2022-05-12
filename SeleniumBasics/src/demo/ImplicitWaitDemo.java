package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	public static void main(String[]args) throws InterruptedException {
		//1 open the browser
		ChromeDriver driver = new ChromeDriver();
		//2 Maximize it
		driver.manage().window().maximize();
		//3 Navigate to application 
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		//4 Click on Start button
		driver.findElementById("start").click();
		//5 Verify the text "Hello world" that appears on the page
		String expectedText= "Hello World!";
		//Implicit wait demo
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String actualText = driver.findElementByCssSelector("#finish > h4").getText();
		System.out.println("Text read from the page-" + actualText);		
		
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test Case Passed");
		} 
		else {
			System.out.println("Test Case Failed");
		}

}}

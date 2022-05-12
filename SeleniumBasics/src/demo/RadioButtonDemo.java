package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonDemo {
	public static void main(String []args) throws InterruptedException {
//		1 Open the browser
		ChromeDriver driver = new ChromeDriver();
		
//		2 Maximize it
		driver.manage().window().maximize();
//		3 Navigate to application
		driver.get("https://facebook.com");
		
//		4 click on ‘Create New Account ‘ button
		driver.findElementByLinkText("Create new account").click();
		//Wait for pop up to appear
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains@type,'radio')][1]")));
		
		
//		5 click on ‘Woman’ radio button
		driver.findElementByXPath("//input[contains@type,'radio')][1]").click();

	}
	

}

package org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public void lunchurl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

	}
	
	public void url(WebElement element, String url) {
		
		element.sendKeys(url);
		

	}
	
	public void sendky() {
		
	
	}
	
	public void cli(WebElement element ) {
	element.click();

	}
	
<<<<<<< HEAD
	public void close() {
		

	}
=======
	public void quit( ) {
		
		
		
	}
	
>>>>>>> 7d972375796d9538ef39dad51e8efa3ed3727004
	
}

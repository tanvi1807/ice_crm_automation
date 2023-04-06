package com.ice.crmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(5000);
		WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
		Select select =new Select(searchDropDown);
		//select.selectByIndex(16);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	    driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}

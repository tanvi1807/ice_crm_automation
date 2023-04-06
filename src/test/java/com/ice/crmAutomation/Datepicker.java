package com.ice.crmAutomation;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

//import java.time.LocalDateTime;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.ice_crm_automation.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker extends BaseClass
{


	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\chromedriver.exe");
	
		ChromeOptions option1 = new ChromeOptions();
   	  option1.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
     EdgeOptions option = new EdgeOptions();
		WebDriver driver=new EdgeDriver();
		driver.get("https://cybersuccess.icehrm.com/");

		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");

		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");

		WebElement loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		loginButton.click();
		//employees
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[text()='Employees']")).click();
		
		 //sub employess
		 driver.findElement(By.xpath("//ul[@id='admin_Employees']/li[1]/a")).click();
		 //add new button
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[contains(text(),'Add New')]")).click();
//		 
//		 int BirthYear=2002;
//		 //calender
//		 driver.findElement(By.id("birthday")).click();
//		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		  driver.findElement(By.xpath("//div[@class='ant-picker-panel']/div/div/div/button[2]")).click();
//		 
//		 List<WebElement> year= driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"));
//		 
//		
//		 for(WebElement element1:year )
//		 {
//			 String year1 = element1.getText();
//			 Integer Year=Integer.valueOf(year1);
//			 
//			if(Year>BirthYear)
//			{ 
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				
//				driver.findElement(By.xpath("//span[@class='ant-picker-super-prev-icon']")).click();
//			}
//			else if (Year ==BirthYear)
//			{
//				element1.click();
//				 
//				List<WebElement> monthelement= driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"));
//				for(WebElement MElement:monthelement)
//				{
//					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//					String Month = MElement.getText();
//					if(Month.equals("Jul"))
//				    {
//						MElement.click();
//						break;
//				    }
//				}
		   LocalDateTime dateTime = LocalDateTime.now();
			 driver.findElement(By.id("//input['rc_select_1']")).click();
			 List<WebElement> genderdropdown= driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[2]"));
			 List<WebElement> genderdropdown1= driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[2]"));
			 for(int i=0;i<genderdropdown.size();i++)
				{
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					WebElement elements = genderdropdown1.get(i);
					String Gender=elements.getText();
					if(elements.equals("Female"))
				    {
						elements.click();
						break;
				    }
				}
		 }
 }
	
	

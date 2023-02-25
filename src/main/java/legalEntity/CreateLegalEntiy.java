package legalEntity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLegalEntiy {
	
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	//Launch Browser
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	//Login into application
	driver.findElement(By.id("username")).sendKeys("nte.kanmani31@sandbox.com");
	driver.findElement(By.id("password")).sendKeys("Kanmani@31");
	driver.findElement(By.id("Login")).click(); 
	//Click on icon
	driver.findElement(By.className("slds-icon-waffle")).click();
	//Click on ViewAll
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	//Click on Legal Entities
	driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
	driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
	//Click on the Dropdown icon in the legal Entities tab
	//driver.findElement(By.xpath("//div[@data-aura-class='uiScroller']")).click();
	//driver.findElement(By.xpath("//div[@class='slds-grid slds-media__body']")).click();
	//click on New
	driver.findElement(By.xpath("//a[@title='New']")).click();
	//Type Name
	//driver.findElement(By.name("Name")).sendKeys("Kanmani");
	//Enter Name as 'Salesforce Automation by Your Name'
	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Kanmani");
	//Click on Save
	//driver.findElement(By.name("SaveEdit")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
}
}


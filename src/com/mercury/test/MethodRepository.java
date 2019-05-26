package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class MethodRepository {
	WebDriver driver;
public void browserapplicationlaunch()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation testing\\Tools\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://newtours.demoaut.com/");
	
}
    public void verifyvalidLogin() throws InterruptedException
    {
    	WebElement uname= driver.findElement(By.xpath("//input[@name='userName']"));
	uname.sendKeys("dasd");
	
	WebElement pswd= driver.findElement(By.xpath("//input[@name='password']"));
	pswd.sendKeys("dasd");
	//WebElement submit= driver.findElement(By.xpath("//input[@name='login']"));
	//submit.click();
	WebElement submit= driver.findElement(By.xpath("//input[@name='login']"));
	Actions act = new Actions(driver);
	act.moveToElement(submit).click().build().perform();
	Thread.sleep(3000);
   String ExpectedTitle ="Find a Flight: Mercury Tours:" ;
   String ActualTitle = driver.getTitle();
   if (ExpectedTitle.equals(ActualTitle))
   {
    System.out.println("Pass");
    
   }
   else 
	   System.out.println("Fail");
   
    }

public void verifyvalidLoginRobotClass() throws AWTException
{
	WebElement uname= driver.findElement(By.xpath("//input[@name='userName']"));
	uname.sendKeys("dasd");
	
	WebElement pswd= driver.findElement(By.xpath("//input[@name='password']"));
	pswd.sendKeys("dasd");	
	Robot r1= new Robot();
	r1.keyPress(KeyEvent.VK_TAB);
	r1.keyPress(KeyEvent.VK_ENTER);

}

public void citySelection()
{
	WebElement depart = driver.findElement(By.xpath("//Select[@name='fromPort']"));
	Select s1= new Select(depart);
	//s1.selectByValue("Frankfurt");
	//s1.selectByVisibleText("Paris");
	s1.selectByIndex(3);
}

public void takescreenshot() throws IOException

{
	//
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(screenshotFile, new File("D:\\Automation testing\\projects\\MercuryTest"));
}
}
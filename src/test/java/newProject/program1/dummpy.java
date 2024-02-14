package newProject.program1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class dummpy
{
	@Test
	public void login() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa.coinyodha.com/fe/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("jack");
		driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("jack");
		driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("jackjack@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Confirm email Address*']")).sendKeys("jackjack@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number*']")).sendKeys("650-912-5185");
		driver.findElement(By.xpath("//input[@placeholder=' Confirm Mobile Number*']")).sendKeys("650-912-5185");
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.id("gender"));
		element1.click();
		//action.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).sendKeys(org.openqa.selenium.Keys.ENTER).build().perform();
		Select selectGender = new Select(element1);
		selectGender.selectByIndex(0);
		Thread.sleep(5000);
		//WebElement element2 = driver.findElement(By.xpath(""));
		driver.quit();
	}
}


//https://qatechhub.com/
//https://nervgh.github.io/pages/angular-file-upload/examples/simple/
//https://practice-automation.com/form-fields/

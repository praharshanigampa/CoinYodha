package newProject.program1.Coinyodha;

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

public class CoindYodhaSignup
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
        driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("jackjack122788787@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Confirm email Address*']")).sendKeys("jackjack122788787@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number*']")).sendKeys("650-912-5185");
        driver.findElement(By.xpath("//input[@placeholder=' Confirm Mobile Number*']")).sendKeys("650-912-5185");
        Actions action = new Actions(driver);
        WebElement element1 = driver.findElement(By.id("gender"));
        element1.sendKeys("Female");
        /*action.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).sendKeys(org.openqa.selenium.Keys.ENTER).build().perform();
        Thread.sleep(5000);*/
        driver.findElement(By.xpath("//input[@placeholder='Street Address*']")).sendKeys("789 jdghug");
        driver.findElement(By.id("country")).sendKeys("UNITED STATES ");
        Thread.sleep(5000);
        driver.findElement(By.id("state")).sendKeys("Alabama ");
        Thread.sleep(5000);
        driver.findElement(By.id("country")).sendKeys("Abbeville");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Zipcode*']")).sendKeys("65373");
        driver.findElement(By.xpath("//input[@placeholder='Select Date of Birth*']")).sendKeys("01/01/2006");
        driver.findElement(By.xpath("//button[text()=' SIGN UP ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='SSN Number*']")).sendKeys("763673767");
        driver.findElement(By.xpath("//input[@placeholder='Confirm SSN Number*']")).sendKeys("763673767");
        driver.findElement(By.xpath("(//button[@class='btn btn-teal'])[1]")).click();
    }
}




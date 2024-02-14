package newProject.program1.egift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChangePassword {
    @Test
	public void ChangeAndLogin() throws InterruptedException{
		ChromeDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://dev.365egifts.com/fe/");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//span[@class='signin-nav btn btn-theme']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='Email']")).sendKeys("gampapraharshani@gmail.com");
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='password']")).sendKeys("Zxcvbnm_45");
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//button[@type='submit']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//span[@class='john-txt']")).click();
		Driver.findElement(By.xpath("//a[@class=' btn btn-theme profile-setting-navbar ']")).click();
		Driver.findElement(By.xpath("//div[@id='mySidbar' and @class='sidenav profile-setting-reset active']//input[@placeholder='password']")).sendKeys("Zxcvbnm_46");
		Driver.findElement(By.xpath("//div[@id='mySidbar' and @class='sidenav profile-setting-reset active']//button[@type='submit']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//span[@class='john-txt']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//a[@class='signup-nav btn-transparent text-primary me-3']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@class='d-flex align-items-center']//span[text()='Login']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='Email']")).sendKeys("gampapraharshani@gmail.com");
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='password']")).sendKeys("Zxcvbnm_46");
		Driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//button[@type='submit']")).click();
	}
}




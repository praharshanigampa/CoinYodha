package newProject.program1.egift;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class loginDegree {
    public static WebDriver driver;
@Test
    public void setup() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.navigate().to("https://dev.365egifts.com/fe/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='signin-nav btn btn-theme']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='Email']")).sendKeys("gampapraharshani@gmail.com");
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='password']")).sendKeys("Zxcvbnm_46");
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//button[@type='submit']")).click();
        Thread.sleep(3000);

    }
}
package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addchild extends BaseTest {
    @Test
    public void teen() throws Exception{
        CoinYodhaLogin l = new CoinYodhaLogin();
        l.login(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Profile Settings']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger btn-sm showMessage']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Username*']")).sendKeys("Randomgirl1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='Enter First Name*'])[2]")).sendKeys("Randommmmmmmmmm");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Last Name*']")).sendKeys("girllll");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='Select Date of Birth'])[2]")).sendKeys("01/01/2006");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Zxcvbnm123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("Zxcvbnm123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("randommmmmmmmmmgirllll@yopmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("612-471-3852");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@placeholder='select gender']")).sendKeys("Female");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='file'])[3]")).sendKeys("/Users/praharshanigampa/Desktop/Black.png");
        driver.findElement(By.xpath("(//button[text()=' Ok '])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=' Update ']")).click();
    }
}

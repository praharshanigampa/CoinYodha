package newProject.program1.egift;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GiftCard {

    @Test
    public void card() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.navigate().to("https://dev.365egifts.com/fe/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='signin-nav btn btn-theme']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='Email']")).sendKeys("gampapraharshani@gmail.com");
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//input[@placeholder='password']")).sendKeys("Zxcvbnm_46");
        driver.findElement(By.xpath("//div[@id='mySidenav' and @class='sidenav sidenav-signin active']//button[@type='submit']")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("(//div[@class='img-crd'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='mb-0']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@name='amount'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Recipient Name']")).sendKeys("tommy");
        driver.findElement(By.xpath("//input[@placeholder='Recipient Email']")).sendKeys("tommy@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Recipient Email']")).sendKeys("tommy@yopmail.com");
        driver.findElement(By.xpath("//textarea[@placeholder='message']")).sendKeys("Testing");
        driver.findElement(By.xpath("(//input[@id='db2086b5-b7ca-4b91-ac63-03a00e7dcc26'])[1]")).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        jse.executeScript("window,scrollBy(0,2000)");
        Thread.sleep(3000);
        try {
            WebElement yourElement = driver.findElement(By.xpath("//button[text()='Confirm']"));
            jse.executeScript("arguments[0].click();", yourElement);
            Thread.sleep(3000);
            WebElement a = driver.findElement(By.xpath("//iframe[@role='presentation']"));
            driver.switchTo().frame(a);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='number']")).sendKeys("4242 4242 4242 4242");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys("08/25");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@placeholder='CVC']")).sendKeys("333");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@placeholder='12345']")).sendKeys("54321");
            Thread.sleep(3000);
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//button[@class='btn btn-primary home-btn']")).click();
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Exception is  " + e);
        }
       driver.close();
    }
}
package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 extends BaseTest {

    @BeforeMethod
    void beforeMethod() throws InterruptedException {
        System.out.println("Before Method");
        Thread.sleep(3000);
        driver.navigate().to("https://qa.coinyodha.com/fe/home");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        driver.findElement(By.xpath("//a[text()='Log In']")).click();
        driver.findElement(By.xpath("//a[text()='Login As Member']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email Address or Phone Number*']")).sendKeys("randomgirl@yopmail.com");
        driver.findElement(By.xpath("//button[text()=' GET OTP ']")).click();
        ChromeDriver driver1 = new ChromeDriver();
        driver1.navigate().to("https://yopmail.com/");
        driver1.findElement(By.xpath("//input[@placeholder='Enter your inbox here']")).sendKeys("randomgirl");
        driver1.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
        Thread.sleep(5000);
        WebElement iframe = driver1.findElement(By.xpath("//iframe[@id='ifmail']"));
        driver1.switchTo().frame(iframe);
        WebElement Path = driver1.findElement(By.xpath("//*[@id='mail']/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/p[2]"));
        String OTP=Path.getText();
        System.out.println(OTP);
        driver1.quit();
        driver.findElement(By.xpath("//input[@name='otp']")).sendKeys(OTP);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(3000);
    }
    @Test(priority=0)

    public void giftCard() throws InterruptedException {
        System.out.println("giftCard Method is executing");
        driver.findElement(By.xpath("//a[text()='Custom ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Event*']")).sendKeys("Testing");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'][3]/div/div/div/input)[1]")).sendKeys("Randomm");
        driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'][3]/div/div/div/input)[2]")).sendKeys("Girll");
        driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'][3]/div/div/div/input)[3]")).sendKeys("randomgirll@yopmail.com");
        driver.findElement(By.xpath("//div[@class='form-group ng-star-inserted'][3]/div/div/div/div/input")).sendKeys("833-269-1066");
        driver.findElement(By.xpath("//input[@name='bussinessImage']")).sendKeys("/Users/praharshanigampa/Desktop/Black.png");
        driver.findElement(By.xpath("(//button[text()='Ok'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='cardBackgroundImage']")).sendKeys("/Users/praharshanigampa/Desktop/Black.png");
        driver.findElement(By.xpath("(//button[text()='Ok'])[3]")).click();
        driver.findElement(By.xpath("//input[@name='cardRedeemImage']")).sendKeys("/Users/praharshanigampa/Desktop/Black.png");
        driver.findElement(By.xpath("(//button[text()='Ok'])[4]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Enter your value'])[1]")).sendKeys("50");
        driver.findElement(By.xpath("//label[text()='wallet ']")).click();
        driver.findElement(By.xpath("//label[text()='I agree to the ']")).click();
        driver.findElement(By.xpath("//button[text()='PURCHASE']")).click();
        Thread.sleep(3000);
    }
    @AfterMethod
    void afterMethod() throws InterruptedException {
        System.out.println("After Method");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
    @AfterClass
    void afterClass(){
        System.out.println("Quit the Webdriver");
        driver.quit();
    }

}

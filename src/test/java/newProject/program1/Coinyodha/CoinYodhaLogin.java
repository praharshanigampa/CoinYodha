package newProject.program1.Coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CoinYodhaLogin {

    @Test
    public void login(WebDriver driver) throws InterruptedException {
        driver.navigate().to("https://qa.coinyodha.com/fe/home");
        driver.manage().window().maximize();
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
    }

}



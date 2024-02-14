package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class Annotations1 extends BaseTest {
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
        public void allTransactions() throws InterruptedException {
            System.out.println("allTransactions is getting executed");
            driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//ul[@class='navigation ng-tns-c10-2 ng-star-inserted']/li[4]")).click();
            driver.findElement(By.xpath("//ul[@class='collapse list-unstyled in']/li[1]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search By OrderID or Currency or Amount']")).sendKeys("346927181");
            Thread.sleep(3000);
        }
        @Test(priority=1)
        public void withdrawOrTransferHistory() throws InterruptedException {
            System.out.println("withdrawOrTransferHistory is getting executed");
            driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//ul[@class='navigation ng-tns-c10-2 ng-star-inserted']/li[4]")).click();
            driver.findElement(By.xpath("//ul[@class='collapse list-unstyled in']/li[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//tr[@class='history-filters ng-star-inserted']/td/input[@placeholder='Order ID']")).sendKeys("82690320409417");
            Thread.sleep(3000);
        }
     /*@Test(priority=2)
     public void walletHistory() throws InterruptedException {
         System.out.println("walletHistory is getting executed");
         driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//ul[@class='navigation ng-tns-c10-2 ng-star-inserted']/li[4]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//ul[@class='collapse list-unstyled in']/li[3]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@placeholder='Order ID']")).sendKeys("PAYID-MW6UHEA7M666821B8764954U");
         Thread.sleep(3000);
     }*/
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


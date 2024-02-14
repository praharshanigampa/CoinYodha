package newProject.program1.Coinyodha;

import generics.BaseTest;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Annotations extends BaseTest {
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

 public void sell() throws Exception {
     System.out.println("Test case 2 is getting executed");
     driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
     driver.findElement(By.xpath("//div[text()=' Sell ']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//select[@name='selectedCurrency']")).sendKeys("Bitcoin");
     Actions a = new Actions(driver);
     WebElement ele = driver.findElement(By.xpath("//div[@class='noUi-touch-area']"));
     a.dragAndDropBy(ele, 100, 0).perform();
     driver.findElement(By.xpath("//button[text()=' Place Order ']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[text()='Continue']")).click();
     Thread.sleep(3000);
 }
    @Test(priority=1)

    public void buy() throws InterruptedException {
        CoinYodhaLogin l = new CoinYodhaLogin();
        l.login(driver);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[text()=' Buy ']")).click();
        driver.findElement(By.xpath("//select[@name='selectedCurrency']")).sendKeys("Stellar");
        driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("26");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=' Place Order ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void crypto() throws Exception{
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//li[@class='ng-tns-c10-2 ng-star-inserted'])[6]/a")).click();
        WebElement element = driver.findElement(By.xpath("//select[@name='selectedCard']"));
        Select s=new Select(element);
        s.selectByValue("B");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Random");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Girl");
        driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("50");
        driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("randomgirl1@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("650-912-5185");
        driver.findElement(By.xpath("//button[text()='Review your order']")).click();
    }
    @Test(priority = 3)
    public void loadWallet() throws InterruptedException {
        String originalWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='Load Wallet']")).click();
        driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("100");
        Thread.sleep(5000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='zoid-component-frame zoid-visible']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//span[@class='paypal-button-text']")).click();
        Thread.sleep(3000);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.xpath("//input[@placeholder='Email or mobile number']")).sendKeys("info@365stockgifts.com");
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("365stockgifts");
        driver.findElement(By.xpath("//button[@value='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Complete Purchase']")).click();
        Thread.sleep(3000);
        driver.switchTo().window(originalWindowHandle);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='OK']")).click();
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
package newProject.program1.Coinyodha;
import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@org.testng.annotations.Listeners(newProject.program1.Coinyodha.Listeners.class)
public class TransferCrypto extends BaseTest {
    @Test
    public void crypto() throws Exception{
        CoinYodhaLogin l = new CoinYodhaLogin();
        l.login(driver);
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
}

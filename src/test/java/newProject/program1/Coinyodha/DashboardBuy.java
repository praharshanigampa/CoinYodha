package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@org.testng.annotations.Listeners(newProject.program1.Coinyodha.Listeners.class)
public class DashboardBuy extends BaseTest {
    @Test

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
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}

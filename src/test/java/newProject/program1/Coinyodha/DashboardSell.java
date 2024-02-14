package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@org.testng.annotations.Listeners(newProject.program1.Coinyodha.Listeners.class)
public class DashboardSell extends BaseTest {
    @Test
    public void sell() throws Exception {
        CoinYodhaLogin l = new CoinYodhaLogin();
        l.login(driver);
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
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}

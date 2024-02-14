package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@org.testng.annotations.Listeners(newProject.program1.Coinyodha.Listeners.class)
public class transactions extends BaseTest {
    @Test
    public void allTransactions() throws InterruptedException {
        CoinYodhaLogin l=new CoinYodhaLogin();
        l.login(driver);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//ul[@class='navigation ng-tns-c10-2 ng-star-inserted']/li[4]")).click();
        driver.findElement(By.xpath("//ul[@class='collapse list-unstyled in']/li[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search By OrderID or Currency or Amount']")).sendKeys("346927181");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}

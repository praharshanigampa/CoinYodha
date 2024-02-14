package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;

@Listeners(newProject.program1.Coinyodha.Listeners.class)

public class AllTransactionsSearchDesc extends BaseTest {
    @Test
     public void descPrint() throws Exception {
        CoinYodhaLogin l=new CoinYodhaLogin();
        l.login(driver);
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//ul[@class='navigation ng-tns-c10-2 ng-star-inserted']/li[4]")).click();
        driver.findElement(By.xpath("//ul[@class='collapse list-unstyled in']/li[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search By OrderID or Currency or Amount']")).sendKeys("Sell Crypto");
        Thread.sleep(3000);
        List<WebElement> Desc = driver.findElements(By.xpath("//div[@class='col-sm-12']/div/table/tbody/tr/td[6]/span"));
        for (int i = 0; i < Desc.size(); i++) {
            String elementDesc = Desc.get(i).getText();
            System.out.println("The list of desc after search with 'BTC' " + elementDesc);
        }
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}
package newProject.program1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alerts {

    @Test
    public void Alert() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        Thread.sleep(3000);
          /*try {
            driver.findElement(By.xpath("//input[@name='alert']")).click();
            Thread.sleep(5000);
            Alert alert = driver.switchTo().alert();
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            driver.switchTo().alert().accept();
            Thread.sleep(5000);
            alert.accept();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception is" + e);
        }
        try {
            driver.findElement(By.xpath("//input[@name='confirmation']")).click();
            Thread.sleep(5000);
            Alert alert1 = driver.switchTo().alert();
            String ConfirmBox = driver.switchTo().alert().getText();
            ConfirmBox = driver.switchTo().alert().getText();
            System.out.println(ConfirmBox);
            driver.switchTo().alert().dismiss();
            Thread.sleep(5000);
            alert1.dismiss();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception is" + e);
        }
      try {
            driver.findElement(By.xpath("//input[@name='prompt']")).click();
            Thread.sleep(5000);
            Alert alert2 = driver.switchTo().alert();
            String alertMessage = driver.switchTo().alert().getText();
            alert2.sendKeys("Testing");
            Thread.sleep(5000);
            System.out.println(alertMessage);
            driver.switchTo().alert().accept();
            Thread.sleep(5000);
            alert2.accept();
            Thread.sleep(5000);
        } catch (Exception b) {
            System.out.println("Exception is" + b);
        }
        try {
            WebElement ele = driver.findElement(By.xpath("//input[@id='double-click']"));
            Actions action = new Actions(driver);
            action.doubleClick().perform();
            Thread.sleep(3000);

        } catch (Exception c) {
            System.out.println("Exception is" + c);
        }*/
        try{
            WebElement Mouse =  driver.findElement(By.xpath("//button[text()='Sub Menu [Hover On Me]']"));
           Actions act = new Actions(driver);
            act.moveToElement(Mouse);
            WebElement con = driver.findElement(By.xpath("//a[text()='CherCher Tech']"));
            Actions a = new Actions(driver);
            a.moveToElement(con).click();
        }catch (Exception d){
            System.out.println("Exception" + d);
        }
        //driver.close();
    }
}

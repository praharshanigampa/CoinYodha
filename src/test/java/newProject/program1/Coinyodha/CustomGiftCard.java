package newProject.program1.Coinyodha;

import generics.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static generics.BaseTest.driver;
@org.testng.annotations.Listeners(newProject.program1.Coinyodha.Listeners.class)
public class CustomGiftCard extends BaseTest {
     @Test

    public void giftCard() throws InterruptedException {
         String number;
          CoinYodhaLogin l=new CoinYodhaLogin();
          l.login(driver);
          driver.findElement(By.xpath("//a[text()='Custom ']")).click();
          Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@placeholder='Event*']")).sendKeys("Testing");
         /*WebElement sender_firstname = driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'][2]/div/div/div/input)[1]"));
         WebElement rec_firstname = driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'][3]/div/div/div/input)[1]"));*/
        /* sender_firstname.sendKeys(Keys.CONTROL);
         sender_firstname.sendKeys("A");
         sender_firstname.sendKeys(Keys.CONTROL);
         sender_firstname.sendKeys("C");
         rec_firstname.sendKeys(Keys.CONTROL);
         rec_firstname.sendKeys("V");*/
         /*Actions a = new Actions(driver);
         a.moveToElement(sender_firstname).keyDown(Keys.CONTROL).sendKeys("a");
         a.sendKeys("c");
         a.moveToElement(rec_firstname).keyDown(Keys.CONTROL).sendKeys("v");
         a.keyUp(Keys.CONTROL).build().perform();*/
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

       /* driver.findElement(By.xpath("//label[text()='Do you want to ship the cards?']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Address*']")).sendKeys("98776 hshh");
        driver.findElement(By.xpath("//input[@placeholder='City*']")).sendKeys("EDAB");
        WebElement state = driver.findElement(By.xpath("(//Select[@placeholder='State*'])[2]"));
        state.click();
        Actions a = new Actions(driver);
        a.keyDown(state, Keys.ARROW_DOWN).build().perform();
        driver.findElement(By.xpath("//input[@placeholder='Zip*']")).sendKeys("78253");*/
         driver.findElement(By.xpath("//label[text()='wallet ']")).click();
        driver.findElement(By.xpath("//label[text()='I agree to the ']")).click();
        driver.findElement(By.xpath("//button[text()='PURCHASE']")).click();
         Thread.sleep(10000);
       driver.findElement(By.xpath("//a[text()=' Print Gift Cards ']")).click();
         WebElement giftcard_number = driver.findElement(By.xpath(""));
         number = giftcard_number.getText().trim();
         System.out.println(number);
        /* driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']/ul/li[6]")).click();
         driver.findElement(By.xpath("//a[text()='Logout']")).click();
         driver.quit();*/
     }
}

package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class uploadFile {
   @Test
   public void uploadFiles() throws InterruptedException {
      ChromeDriver driver = new ChromeDriver();
       driver.navigate().to("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
      driver.findElement(By.xpath("//input[@uploader='uploader'][2]")).sendKeys("//Users//praharshanigampa//Downloads//Keyutech//src//main//java//generics//BaseTest.java");
       Thread.sleep(5000);
   }
}


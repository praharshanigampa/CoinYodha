package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNew {
@Test
        public void log() throws Exception{
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("admin12");
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    driver.quit();
}
}

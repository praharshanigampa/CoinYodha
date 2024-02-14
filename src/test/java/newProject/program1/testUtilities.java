package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testUtilities {


    @Test
    public void setUp() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qa.coinyodha.com/fe/home");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();



        driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("jack");
        driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("jack");
        driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("jackjack@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Confirm email Address*']")).sendKeys("jackjack@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number*']")).sendKeys("650-912-5185");
        driver.findElement(By.xpath("//input[@placeholder=' Confirm Mobile Number*']")).sendKeys("650-912-5185");

        WebElement genderDropdown = driver.findElement(By.id("gender"));
        Select selectGender = new Select(genderDropdown);
        selectGender.selectByIndex(0); // Select the first option

        Thread.sleep(5000);

        driver.quit();
    }
}

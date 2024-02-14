/*
package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Assignment1 {

    ChromeDriver driver;

    public void LaunchChrome(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qatechhub.com");
    }
    public void PassOrFail(){
        String text = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
        WebElement ele = driver.findElement(By.xpath("//title[text()='QA Automation Tools Trainings and Tutorials | QA Tech Hub']"));
        ele.getText();
        if(ele.equals(text)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
    }
    public void navigateCommands() {

        driver.navigate().to("https://facebook.com");

        driver.navigate().back();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.navigate().forward();

        driver.navigate().refresh();
    }
    public void close(){
        driver.quit();
    }


}
*/
package newProject.program1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qatechhub.com");
        checkTitle(driver.getTitle());
        driver.get("https://www.facebook.com");
        driver.navigate().back();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }

    private static void checkTitle(String title) {
        String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
        if (title.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

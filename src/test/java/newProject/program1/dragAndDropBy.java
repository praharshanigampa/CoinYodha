package newProject.program1;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDropBy {
      @Test
	public void dropBy() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone 15");
		element.sendKeys(Keys.RETURN);
		Actions act = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		act.dragAndDropBy(ele1, 25, 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(ele2, -25, 0).perform();
	}
}

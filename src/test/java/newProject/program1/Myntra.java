package newProject.program1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {

	@Test
	public void PrintAllProducts() throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Perfume");
				//ele.submit();
				//ele.sendKeys(Keys.RETURN);
				driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
				Thread.sleep(3000);
			
		List<WebElement> element = driver.findElements(By.xpath("//section[@style='width: 100%;']/ul/li/a/div[2]/h3"));
		for(Object e: element) {
			System.out.println("Name : " + e);
		}
				
				
	}
}

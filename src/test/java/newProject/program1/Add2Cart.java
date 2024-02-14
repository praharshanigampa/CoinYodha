package newProject.program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add2Cart {
    @Test
	public void AddToCart() throws InterruptedException {
    	ChromeDriver driver = new ChromeDriver();
    	driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone 11");
		element.sendKeys(Keys.RETURN);
		List<WebElement> Name = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
		String parentWindowHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
		for (int i = 0; i < Name.size(); i++) {
			WebElement product = Name.get(i);
			if ((i == 0 || i == 2 || i == Name.size() - 1)) {	
                product.click();
				Thread.sleep(5000);
				 Iterator<String> it = handles.iterator(); {
					 String child_window=it.next();
					if(!handles.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				Thread.sleep(3000);
				driver.close();
					}
				}
			}
			driver.switchTo().window(parentWindowHandle);
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

package newProject.program1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartProductCompare {
	@Test
	public void compare() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone 11");
		element.sendKeys(Keys.RETURN);	
		ArrayList<String> result = new ArrayList<String>();
		List<WebElement> Name = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
		List<WebElement> Price = driver.findElements(By.xpath("(//div[@class='col col-7-12'])/following-sibling::div/div[1]/div[1]/div"));
		List<WebElement> compare= driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		Actions actions = new Actions(driver);
		for (int i = 0; i < Name.size(); i++) {
			try {
                Name = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
                Price = driver.findElements(By.xpath("(//div[@class='col col-7-12'])/following-sibling::div/div[1]/div[1]/div"));
                compare= driver.findElements(By.xpath("//span[text()='Add to Compare']"));
                WebElement product = Name.get(i);
				if (i == 0 || i == 2 || i == Name.size() - 1) {
					WebElement addToCompare = compare.get(i);
                    actions.moveToElement(addToCompare).click().perform();
                    product.click();
					Thread.sleep(5000);
					ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	                driver.switchTo().window(tabs.get(0));
					driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
					Thread.sleep(3000);
					driver.close();
					String elementName = Name.get(i).getText();
					String elementPrice = Price.get(i).getText();
					result.add("Name" + elementName + "   " + "Price" + elementPrice);
				}
				System.out.println("The END");
			} catch (StaleElementReferenceException e) {
				System.out.println("StaleElementReferenceException");
			}
		}
				
		for (Object o : result) {
			System.out.println(o);
		}
	}
}

//get window handle - use this concept to switch tabs

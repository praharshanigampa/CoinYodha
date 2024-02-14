package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void Flipkartlogin() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement e=driver.findElement(By.xpath("//span[text()='Travel']"));
		Actions element = new Actions(driver);
		element.moveToElement(e).contextClick().build().perform();
		/*WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone 15 pro");
		element.submit();// used for enter without keys
		//element.sendKeys(Keys.RETURN);// used for enter with keys
		WebElement findEle = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		WebElement find = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]/following-sibling::div/div[1]/div[1]/div"));
		String test = findEle.getText();
		String test1 = find.getText();
		System.out.println(test);
		System.out.println(test1);*/
		//driver.quit();
		

	}
}
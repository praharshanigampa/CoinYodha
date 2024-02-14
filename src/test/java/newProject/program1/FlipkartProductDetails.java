package newProject.program1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartProductDetails {
	@Test
	public void ProductDetails() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys("iphone 15 pro");
		element.submit();
		ArrayList<String> productDetails = new ArrayList<>();
        List<WebElement> Name = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
        List<WebElement> Price = driver.findElements(By.xpath("(//div[@class='col col-7-12'])/following-sibling::div/div[1]/div[1]/div"));
        for (int i = 0; i < Name.size(); i++) {
        	String elementName = Name.get(i).getText();
        	String elementPrice = Price.get(i).getText();
            productDetails.add("Name: " + elementName + ", Price: " + elementPrice);
        }

        for (int i = 0; i < productDetails.size(); i++) {
            System.out.println(productDetails.get(i));
        }
     
        driver.quit();

	}
}
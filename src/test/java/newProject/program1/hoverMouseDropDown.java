package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hoverMouseDropDown {
	@Test
	public void drodown() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement element = driver.findElement(By.xpath("//button[text()='Sub Menu [Hover On Me]']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("//a[@id='link1']"));
		action.moveToElement(ele2).click().build().perform();
		//action.sendKeys(Keys.DOWN,Keys.DOWN).click();
		Thread.sleep(3000);
		driver.quit();
	}
}

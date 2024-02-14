package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
    @Test
	public void drop() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement ele1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(ele, ele1).build().perform();
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement ele3 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		act.dragAndDrop(ele2, ele3).build().perform();
	}
	
}

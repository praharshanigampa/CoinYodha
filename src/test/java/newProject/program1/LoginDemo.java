package newProject.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class LoginDemo {
	@Test
	public void login() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("Admin",Keys.TAB, "admin123",Keys.ENTER);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement nav = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
		action.moveToElement(nav).click();
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//i[@class='oxd-icon bi-x oxd-sidepanel-header-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		WebElement user=	driver.findElement(By.xpath("(//form[@class='oxd-form']/div[1]/div/div/div)[1]/div[2]/input"));
		user.sendKeys("aaaaa",Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		user.click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement Search = driver.findElement(By.xpath("//button[text()=' Search ']"));
		//i[@class='oxd-icon bi-caret-up-fill']"));	
		Thread.sleep(2000);
		a.moveToElement(Search).click().build().perform();
		WebElement add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		a.moveToElement(add).click().build().perform();
		
	}
}
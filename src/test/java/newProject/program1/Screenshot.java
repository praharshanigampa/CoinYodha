package newProject.program1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigate to the website
		driver.get("https://www.flipkart.com/");

		try {
			// Find an element on the page (for example, an input field)
			WebElement element = driver.findElement(By.name("q"));

			// Perform some actions on the element
			element.sendKeys("Selenium");

			// Take a screenshot and save it to a file
			takeScreenshot(driver, "screenshot.png");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			//driver.quit();
		}
	}

	private static void takeScreenshot(WebDriver driver, String fileName) {
		// Convert WebDriver object to TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		// Capture the screenshot as File
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		// Specify the location to save the screenshot
		File destFile = new File("Screenshots/screenshot.png");

		try {
			// Copy the screenshot to the desired location
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot captured: " + destFile.getAbsolutePath());

		} catch (IOException e) {
			System.out.println("Unable to capture screenshot: " + e.getMessage());
		}
	}
}

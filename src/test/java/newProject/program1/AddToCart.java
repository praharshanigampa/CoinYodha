package newProject.program1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AddToCart {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/https://www.flipkart.com/");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the product page
        driver.get("https://example.com/product-page");

        // Find the element representing the "Add to Cart" button and click it
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-button']"));
        addToCartButton.click();

        // Allow time for the new tab to open
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch to the new tab
        String originalHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        handles.remove(originalHandle);

        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);

        // Optionally, you may need to interact with elements in the new tab (e.g., filling out forms, selecting options)
        // ...

        // Close the browser window
        driver.quit();
    }
}

package newProject.program1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollHandle {
	      @Test
		public void dropBy() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.myntra.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			Thread.sleep(3000);
			jse.executeScript("window,scrollBy(0,5000)");
}
}

/*drodown ways

keys
click - findelement
robort class
select class


*/
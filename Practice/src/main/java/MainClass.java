import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,470)");
		List<WebElement> chckBoxes = driver
				.findElements(By.xpath("//div[@class='form-check form-check-inline']/input[@type='checkbox']"));
		
		for(WebElement box:chckBoxes)
		{
			box.click();
			Thread.sleep(1000);
		}

//		js.executeScript("window.scrollBy(0,1770)");
//		
//		List<WebElement> tdata = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));
//		
//		for(WebElement data:tdata)
//		{
//			System.out.println(data.getText());
//			
//		}

		Thread.sleep(3000);
		driver.close();

	}

}

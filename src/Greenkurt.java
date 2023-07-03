import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkurt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\LEADS Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\LEADS Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] items = { "Cucumber", "Carrot", "Brinjal" };
		addItems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
		//explicit wait
         WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
         
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/button")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/span")).getText())  ;

	}

	public static void addItems(WebDriver driver, String[] items) {
		int j = 0;
		List<WebElement> pro = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < pro.size(); i++) {

			String[] productName = pro.get(i).getText().split("-");
			String formatName = productName[0].trim();
			List al = Arrays.asList(items);

			if (al.contains(formatName)) {
				/// now click
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;

				if (j == items.length) {
					break;
				}
			}

		}
	}
} 
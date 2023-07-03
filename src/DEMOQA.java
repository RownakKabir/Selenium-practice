import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DEMOQA {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\LEADS Training\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("firstName")).sendKeys("Rabbi");
		driver.findElement(By.id("lastName")).sendKeys("Hasan");
		driver.findElement(By.id("userEmail")).sendKeys("rabbi@gmail.com");
       // driver.findElement(By.cssSelector("input[value='Male']")).click();
               
        driver.findElement(By.id("userNumber")).sendKeys("01683526852");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select s1 = new Select(driver.findElement(
				By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		        s1.selectByValue("2");

		Select s2 = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		s2.selectByValue("1998");

	//	List<WebElement> dates = driver.findElements(By.cssSelector("div[role='option']"));

		int size1 = driver.findElements(By.cssSelector("div[role='option']")).size();
		for (int j = 0; j < size1; j++) {

			String text = driver.findElements(By.cssSelector("div[role='option']")).get(j).getText();
			if (text.equalsIgnoreCase("13")) {
				driver.findElements(By.cssSelector("div[role='option']")).get(j).click();
				break;

			}
		}
		
		
		driver.findElement(By.cssSelector("input[id='uploadPicture']")).sendKeys("C:\\Users\\LEADS Training\\Desktop\\New Text Document.txt");
		
		
		
		
		
		

	}}



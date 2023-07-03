import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {
  
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\LEADS Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		List <WebElement> btn=driver.findElements(By.cssSelector("input[name='radioButton']"));
		int size= btn.size();
		for(int i=0;i<size;i++) {
		
			 String gender = btn.get(i).getAttribute("value");
	  if(gender.equalsIgnoreCase("radio3")) {
		    
		  btn.get(i).click();
		  
	  }
			
			
		}
		
		
	Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
       s.selectByValue("option1");
       System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl()); 
      driver.get("https://www.youtube.com/");
      driver.navigate().back();
      driver.navigate().forward();
      driver.close(); 
      driver.quit();    
       
	
	}

}

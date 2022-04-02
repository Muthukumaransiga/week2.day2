package week2.day2;

//import org.openqa.selenium.remote.http.WebSocket$Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	// Launch new browser for every execute
			public static void main(String[] args) {
				
				// Setup the driver
				WebDriverManager.chromedriver().setup(); //static
				
				// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//1.Load the URL
				
				driver.get("https://acme-test.uipath.com/login");
				
				// Maximize the browser
				driver.manage().window().maximize();
				
				// identify and enter value
				
				// 2.Enter the Email
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				//3.Enter the Use Password
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				// 4.Click the login button using xpath
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button")).click();
				//5.Get the title of resulting page.
				String title = driver.getTitle();
				System.out.println(title);
				// 6.Click the leads link
				driver.findElement(By.linkText("Log Out")).click();
				// 7.Close the browser
				driver.close();
				// Close the browser
}
			}
	

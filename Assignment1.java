package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	// Launch new browser for every execute
			public static void main(String[] args) {
				
				//1. Setup the driver
				WebDriverManager.chromedriver().setup(); //static
				
				// 2.Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//3.Load the URL
				
				driver.get("https://en-gb.facebook.com/");
				
				//4. Maximize the browser
				driver.manage().window().maximize();
				// Add implict wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// 6.Click the Create the new account
				driver.findElement(By.linkText("Create New Account")).click();
				
				
				// 7.Enter the first name
				WebElement firstName = driver.findElement(By.name("firstname"));
				firstName.sendKeys("Muthukumaran");
				
				// 8.Enter the last name
				WebElement lastName =driver.findElement(By.name("lastname"));
				lastName.sendKeys("Sigamani");
				
				// 9. Enter Mobile Number
				WebElement mobile_Email = driver.findElement(By.name("reg_email__"));
				mobile_Email.sendKeys("9787875054");
				
				// 10. Enter Password
				WebElement passWord = driver.findElement(By.name("reg_passwd__"));
				passWord.sendKeys("kumar");
				// 11.Handle dropdowns
				WebElement dayDropdown = driver.findElement(By.id("day"));
				Select day= new Select(dayDropdown);
				day.selectByVisibleText("5");
				
				WebElement monDropdown = driver.findElement(By.id("month"));
				Select month= new Select(monDropdown);
				month.selectByVisibleText("Oct");
				
				WebElement yearDropdown = driver.findElement(By.id("year"));
				Select year = new Select(yearDropdown);
				year.selectByVisibleText("1983");
				
				// Select the Radio button
				WebElement gender = driver.findElement(By.xpath("//label[text() = 'Female']//following-sibling::input"));
				if(!gender.isSelected())
				gender.click();
				else
				System.out.println("Gender Already Selected");
								
}
			}
	


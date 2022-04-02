package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	// Launch new browser for every execute
				public static void main(String[] args) {
					
					// Setup the driver
					WebDriverManager.chromedriver().setup(); //static
					
					// Launch the browser
					ChromeDriver driver = new ChromeDriver();
					
					//1.Load the URL
					
					driver.get("http://leaftaps.com/opentaps/control/main");
					
					// Maximize the browser
					driver.manage().window().maximize();
					
					// 2.Enter the User Name
					driver.findElement(By.id("username")).sendKeys("DemoCSR");
					//2.Enter the Use Password
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					// 3.Click the submit button using class
					driver.findElement(By.className("decorativeSubmit")).click();
					// 4.Click the CRM/SFA link
					driver.findElement(By.linkText("CRM/SFA")).click();
					// 5.Click the leads link
					driver.findElement(By.linkText("Leads")).click();
					// 6.Click the create lead link text
					driver.findElement(By.linkText("Create Lead")).click();
					// 7.Enter the company name
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
					// 8.Enter the first name
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("muthukumaran");
					// 9.Enter the last name
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sigamani");
					// 10.Enter the first local name
					driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("muthu");
					// 11.Enter the Department name
					driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
					// 12.Enter the description
					driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome");
					// 13.Enter the Email
					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthukumaran0510@gmail.com");
					// 14.select State/Province
					WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
					Select dd= new Select(eleDropdown);
					//dd.selectByIndex(4);
					dd.selectByVisibleText("New York");
					//15.Click the Create button
					driver.findElement(By.name("submitButton")).click();
					//16.Get the title of resulting page.
					String title = driver.getTitle();
					System.out.println(title);
					//17.Click on duplicate button
					driver.findElement(By.linkText("Duplicate Lead")).click();
					//18. Clear the Company name
					WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
					compName.clear();
					compName.sendKeys("Accentue");
					//19. Clear the description field
					WebElement fisName = driver.findElement(By.id("createLeadForm_firstName"));
					fisName.clear();
					fisName.sendKeys("Murugan");
					//20.Click the Create button
					driver.findElement(By.name("submitButton")).click();
					//20.Get the title of resulting page.
					String title1 = driver.getTitle();
					System.out.println(title1);
					// Close the browser
					driver.close();

	}

}

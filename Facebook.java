package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		// driver.manage().timeouts().implicitlyWait(Duration.of.seconds(15));
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Vaishali");
		
		driver.findElement(By.name("lastname")).sendKeys("S");
			
		driver.findElement(By.name("reg_email__")).sendKeys("invaishbox@gmail.com");
				
		driver.findElement(By.id("password_step_input")).sendKeys("welcome@123");
			
		// Step 11: Handle all the three drop downs
			WebElement sourcedropdown = driver.findElement(By.id("day"));
			Select dd = new Select(sourcedropdown);
			dd.selectByIndex(4);
			
			WebElement month = driver.findElement(By.id("month"));
			Select dd2 = new Select(month);
			dd2.selectByVisibleText("Sep");
			
			
			WebElement year = driver.findElement(By.id("year"));
			Select dd3 = new Select(year);
			dd3.selectByVisibleText("1991");
			
			//Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();	
		
	}

}

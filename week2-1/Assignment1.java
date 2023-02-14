package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishali");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sham");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
	    driver.findElement(By.name("description")).sendKeys("Welcome");
	    driver.findElement(By.name("primaryEmail")).sendKeys("invaishbox@gmail.com");
	    WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(province);
	    dd.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    
	    String title = driver.getTitle();
		System.out.println(title);
	    
	
	}

}

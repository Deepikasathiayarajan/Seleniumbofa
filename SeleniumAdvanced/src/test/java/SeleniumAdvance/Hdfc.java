package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Hdfc {
	
	@Test
	public void bank() throws InterruptedException 
  {

		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.hdfcbank.com/");
		  driver.findElement(By.linkText("Products"));
		  Actions act1=new Actions(driver);
		  act1.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products']"))).perform();
		  Thread.sleep(2000);
		  act1.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products/demat']"))).perform();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("a[href='/personal/products/demat/demat-account']")).click();
		  driver.close();
	 
  }

}

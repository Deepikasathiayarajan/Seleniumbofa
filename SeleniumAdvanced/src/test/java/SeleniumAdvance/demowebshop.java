package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demowebshop {
  @Test
  public void f() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("deepika@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("deepika");
	  driver.findElement(By.cssSelector("input[value='Log in']")).click();
	  driver.findElement(By.linkText("Jewelry")).click();
	  driver.findElement(By.linkText("Black & White Diamond Heart")).click();
	  driver.findElement(By.id("addtocart_14_EnteredQuantity")).sendKeys("2");
	  driver.findElement(By.id("add-to-cart-button-14")).click();
	  driver.findElement(By.partialLinkText("Shopping cart")).click();
	  driver.findElement(By.name("discountcouponcode")).sendKeys("Automation");
	  driver.findElement(By.name("applydiscountcouponcode")).click();
	  //driver.close();
	  

  }
}

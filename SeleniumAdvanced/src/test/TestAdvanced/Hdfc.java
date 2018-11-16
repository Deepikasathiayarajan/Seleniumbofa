package TestAdvanced;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hdfc {
	
  @Test
  public void Bank()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.findElement(By.partialLinkText("Products")).click();
  }
//  @BeforeTest
//  public void beforetest()
//  {
//
//  }
  
}

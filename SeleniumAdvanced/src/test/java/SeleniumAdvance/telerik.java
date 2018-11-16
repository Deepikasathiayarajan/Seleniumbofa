package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class telerik {
  @Test
  public void Telerik() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  WebElement from=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadTreeView1']/ul/li/ul/li[3]/ul/li[1]/div/div"));
	  WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
	  
	  Actions act1=new Actions(driver);
	  act1.clickAndHold(from).release(to).perform();
	  WebDriverWait wait=new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"),"Drop a package here to check price"));
	  String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
	  System.out.println(price);
	  driver.close();
	  
	  
	  
	  
  }
}

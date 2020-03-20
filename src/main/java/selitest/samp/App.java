package selitest.samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;




/**
 * Hello world!
 *
 */
public class App 
{
	
	 
	   WebDriver driver;
	   @Test
	   public void test()
	   {
		  System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("disable-infobars");
		   options.addArguments("--headless");

		   driver = new ChromeDriver(options);
		   
		   
		   //driver.get("https://www.bing.com/");
		   
		 //driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("intellipaat");
		 //driver.findElement(By.xpath("//label[@class='search icon tooltip']//*[local-name()='svg']")).click();
		 //driver.get("http://localhost/");
		 //driver.findElement(By.xpath("//html//body")).isDisplayed();
		   driver.get("http://http://34.68.203.213:90/");
		   driver.findElement(By.xpath("//html//body"));
		 
		 //System.out.println(driver.getTitle());
		   
		   System.out.println("yes displayed");
		   driver.quit();
	   }
	   public static  void main(String[] args){
			 
		   App app = new App();
		   app.test();
		   System.out.println("Test Run Successfully");
	   }
}

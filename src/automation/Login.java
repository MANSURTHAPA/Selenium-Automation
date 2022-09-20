package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  String URL="http://automationpractice.com/index.php";
	  
	  // Open URL and Maximize browser window
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	  
	  //Click on Sign in
	  driver.findElement(By.linkText("Sign in")).click();
	  //Login
	  driver.findElement(By.id("email")).sendKeys("mansur@test.com");
	  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
	  driver.findElement(By.id("SubmitLogin")).click();
	  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
	  
	  //succesfull login
	  if(userText.contains("Vsoft")) {
		   System.out.println("Login sucessfull");
		  }
		  else {
		   System.out.println("Login Failed");
		  }
	}
}

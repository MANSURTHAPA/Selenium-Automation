package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ForgotPassword {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mansur\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		// Login
		
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		
		 driver.findElement(By.id("email")).sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);
	
		WebElement ForgetBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		ForgetBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("mansur@test.com");;
		Thread.sleep(1000);
	
		WebElement Retriev = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
		Retriev.click();
		  String Rtrsucess=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
		  
		  if(Rtrsucess.contains("A confirmation email has been sent to your address:")) {
			   System.out.println("Forgot password retrival success");
			  }
			  else {
			   System.out.println("Retrival Failed");
			  }
		
	}	
}

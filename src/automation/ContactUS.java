package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUS {

	public static void main(String[] args) throws InterruptedException {
		// Todo: Use relative path for chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Todo: use base url constant
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		driver.findElement(By.id("contact-link")).click();
		WebElement subject = driver.findElement(By.id("id_contact"));
		Select subsel = new Select(subject);
		subsel.selectByVisibleText("Customer service");
		driver.findElement(By.id("email")).sendKeys("mansur@test.com");
		driver.findElement(By.id("id_order")).sendKeys("mansursada");
		WebElement uploadElement = driver.findElement(By.id("fileUpload"));
		uploadElement.sendKeys("D:\\test.html.txt");
		driver.findElement(By.id("message")).sendKeys("Helllo how are you?");
		driver.findElement(By.id("submitMessage")).click();
		Thread.sleep(1000);

		String Rtrsucess = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

		if (Rtrsucess.contains("Your message has been successfully sent to our team.")) {
			System.out.println("passed");

		} else {
			System.out.println("Failed");

		}
		driver.close();

	}
}

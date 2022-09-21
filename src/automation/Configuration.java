package automation;
import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Configuration {

	public static Properties properties = new Properties(); 
	public static WebDriver driver;
	public static WebDriver browser() {
		String filepath = "/AutomationTesting/src/drivers/chromedriver.exe";
		filepath = System.getProperty("user.dir") + "/" + filepath;
		File file = new File(filepath);
		System.setProperty("webdriver.chrome.driver",
				file.getAbsolutePath());
		return driver = new ChromeDriver();
			
		}
}

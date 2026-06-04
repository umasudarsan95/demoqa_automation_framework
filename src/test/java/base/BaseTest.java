package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://demoqa.com/text-box");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}
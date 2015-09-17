package WebDriverTest;


import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MoodleIE {
  private WebDriver driver;
  private String baseUrl;
 //private boolean acceptNextAlert = true;
 //private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
  
	System.setProperty("webdriver.chrome.driver",
						"C:/Selenium/IE/IEDriverServer.exe");
	driver = new InternetExplorerDriver();
    driver.navigate().to("https://www.moodle.tum.de/");
    baseUrl = "https://www.moodle.tum.de/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
  }

  @Test
  public void testWebDriver() throws Exception {
	driver.get(baseUrl);
    driver.findElement(By.linkText("I have a TUM ID")).click();
    driver.findElement(By.name("j_username")).clear();
    driver.findElement(By.name("j_username")).sendKeys("albert.aalmann@tum.de");
    driver.findElement(By.name("j_password")).clear();
    driver.findElement(By.name("j_password")).sendKeys("Ss00000!");
    driver.findElement(By.name("Login")).click();
    driver.findElement(By.linkText("Automated Testing Tijana")).click();
    driver.findElement(By.cssSelector("div.singlebutton > form > div > input[type=\"submit\"]")).click();
  
  }
  
}


package org.ual.hmis.BravoDahbi;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class CambiodecontraseadeusuariologueadoCasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//	  
//	  ChromeOptions chromeOptions = new ChromeOptions();
//	  chromeOptions.setHeadless(true);
//	  driver = new ChromeDriver(chromeOptions);
	  	
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  firefoxOptions.setHeadless(true);
	  driver = new FirefoxDriver(firefoxOptions);
	  
	
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cambiodecontraseadeusuariologueadoCasocorrecto() {
    driver.get("http://sepultura.northeurope.cloudapp.azure.com:1337/login");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("blackgaminglist@gmail.com");
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Mangelrogel456");
    driver.findElement(By.cssSelector(".ajax-button")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("header-account-menu-link")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.id("password")).sendKeys("Mangelrogel456");
    driver.findElement(By.cssSelector(".row:nth-child(1) > .col-sm-6:nth-child(2) > .form-group")).click();
    driver.findElement(By.id("confirm-password")).click();
    driver.findElement(By.id("confirm-password")).sendKeys("Mangelrogel456");
    driver.findElement(By.cssSelector(".ajax-button")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();     
    }
    try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    
    driver.findElement(By.id("header-account-menu-link")).click();
    driver.findElement(By.linkText("Sign out")).click(); 
    driver.findElement(By.cssSelector(".navbar-brand")).click();
  }
}

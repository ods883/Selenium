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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditarelperfildeusuariologueadocasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "selenium-drivers/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver", "selenium-drivers/geckodriver.exe");
	   ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.setHeadless(true);

	  driver = new ChromeDriver(chromeOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void editarelperfildeusuariologueadocasocorrecto() {
    driver.get("http://sepultura.northeurope.cloudapp.azure.com:1337/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Log in")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("blackgaminglist@gmail.com");
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Mangelrogel456");
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys(Keys.ENTER);
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("header-account-menu-link")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.linkText("Settings")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.linkText("Edit profile")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("full-name")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("full-name")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".button-text")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("header-account-menu-link")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.linkText("Sign out")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".logo")).click();
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  }
}

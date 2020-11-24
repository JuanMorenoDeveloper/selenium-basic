package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FindmochajsTest {

  static JavascriptExecutor js;
  private static WebDriver driver;
  private static Map<String, Object> vars;

  @BeforeAll
  static void setUp() {
    System.setProperty("webdriver.chrome.driver",
        "/home/juan/Downloads/chromedriver_linux64/chromedriver");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @AfterAll
  static void tearDown() {
    driver.quit();
  }

  @Test
  void findmochajs() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1312, 741));
    driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("mochajs");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("div:nth-child(1) > .rc .LC20lb > span")).click();
    assertThat(driver.findElement(By.id("sponsors")).getText()).isEqualTo("SPONSORS");
  }
}
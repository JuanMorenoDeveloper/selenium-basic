package org.example;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;
import static org.assertj.core.api.Assertions.assertThat;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

class FindmochajsSelenideTest {

  @BeforeAll
  static void init() {
    Configuration.headless = true;
    Configuration.browserSize = "1920x1080";
    Configuration.savePageSource = true;
  }


  @Test
  void findmochajs() {
    open("https://www.google.com/");
    $(By.xpath("//input[@name=\'q\']")).sendKeys("mochajs");
    $(By.name("q")).sendKeys(Keys.ENTER);
    $(By.cssSelector("div:nth-child(1) > .rc .LC20lb > span")).click();

    assertThat($(By.id("sponsors")).getText()).isEqualTo("SPONSORS");
  }

  @Test
  void dunno() {
    open("https://www.google.com/");
    screenshot("index_google");
    $(By.xpath("//input[@name=\'q\']")).sendKeys("mochajs");
    $(By.name("q")).sendKeys(Keys.ENTER);
    $(By.cssSelector("div:nth-child(1) > .rc .LC20lb > span")).click();
    var p = $(By.xpath("//body")).innerText();
    screenshot("index_mochajs");
    assertThat(p).contains("Use Mocha at Work?");
  }
}
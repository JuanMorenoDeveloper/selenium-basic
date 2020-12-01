package org.example;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class GooglePage {
  public void searchFor(String text) {
    $(By.name("q")).val(text).pressEnter();
  }
}

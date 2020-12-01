package org.example;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class TeamsPage {

  String getBody(){
    return $(By.xpath("//body")).innerText();
  }
}

package org.example;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

class StackOverflowPage {

  TeamsPage clickOnSOTeams() {
    //Desplegue menú
    $(By.linkText("Products")).click();
    //Click en la opción
    $(By.cssSelector(".m6:nth-child(2) .fs-caption")).click();

    return new TeamsPage();
  }
}

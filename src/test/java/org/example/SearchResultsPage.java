package org.example;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class SearchResultsPage {
  public ElementsCollection getResults() {
    return $$("#res .g");
  }
  public SelenideElement getResult(int index) {
    return $("#res .g", index);
  }
}

package org.example;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GoogleTest {

  @Test
  public void userCanSearch() {
    //ARRANGE
    open("https://google.com/ncr");

    //ACT
    new GooglePage().searchFor("selenide");
    SearchResultsPage results = new SearchResultsPage();

    //ASSERT
    assertThat(results.getResults()).hasSizeGreaterThan(1);
    assertThat(results.getResult(0).toString()).contains("Selenide: concise UI tests in Java");
  }
}

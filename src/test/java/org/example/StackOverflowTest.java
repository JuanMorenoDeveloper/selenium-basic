package org.example;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StackOverflowTest {

  @Test
  void whenClickOnSOTeams_thenGetTeamsPageWithPromo() {
    //ARRANGE
    open("https://stackoverflow.com/");

    //ACT
    var teamsPage = new StackOverflowPage().clickOnSOTeams();

    //ASSERT
    assertThat(teamsPage.getBody()).contains("Manage and share knowledge across your company");
  }
}

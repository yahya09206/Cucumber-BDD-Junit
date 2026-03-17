package com.yahya.step_definitions;

import com.yahya.pages.BingSearchPage;
import com.yahya.utils.BrowserUtil;
import com.yahya.utils.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bing_StepDef {

    // Declare at global level
    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }
    @When("user enters the word orange")
    public void user_enters_the_word_orange() {
        bingSearchPage.searchBox.sendKeys("orange");
    }
    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        BrowserUtil.verifyTitle("orange");
    }

    @When("user enters the word {string}")
    public void userEntersTheWord(String word) {
        bingSearchPage.searchBox(word);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtil.verifyTitle(expectedTitle + " - Search");
    }

}

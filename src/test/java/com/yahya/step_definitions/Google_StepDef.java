package com.yahya.step_definitions;

import com.yahya.pages.GoogleSearchPage;
import com.yahya.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Google_StepDef {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }

    @When("user enters the word apple")
    public void user_enters_the_word_apple() {


    }
    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title() {

    }
}

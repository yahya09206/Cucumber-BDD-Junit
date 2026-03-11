package com.yahya.step_definitions;

import com.yahya.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class Google_StepDef {

    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}

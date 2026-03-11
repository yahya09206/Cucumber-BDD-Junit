package com.yahya.utils;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * This call will only be storing the utility methods that can be used across the project.
 */
public class BrowserUtil {

    // Sleep method
    public static void sleep(int seconds){
        seconds *= 1000;
        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){


        // Return and store all window handles in a Set
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);
            System.out.println(Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        // Assert that title contains "Etsy"
        String actualTitle = Driver.getDriver().getTitle();

        Assertions.assertTrue(actualTitle.contains(expectedTitle));

    }

    public static void verifyTitle(String expectedTitle){

        Assertions.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    public static void verifyTitleContains(WebDriver driver, String expectedTitle){

        Assertions.assertTrue(driver.getTitle().contains(expectedTitle));

    }
}
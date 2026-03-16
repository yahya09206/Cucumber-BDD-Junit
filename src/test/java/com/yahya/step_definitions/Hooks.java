package com.yahya.step_definitions;

import com.yahya.utils.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /**
     * Class for creating pre- and post-conditions for all of the scenarios and/or steps
     */

//    @Before
//    public void setupMethod(){
//        System.out.println("@Before ---> runs before each scenario");
//    }

    @After
    public void teardownMethod(Scenario scenario){

        // only screenshot for failed scenarios
        if (scenario.isFailed()){
            // store pic in byte
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("@After ---> runs after each scenario");
        Driver.closeDriver();
    }

//    @BeforeStep
//    public void setupStep(){
//        System.out.println("@BeforeStep: Running before each step!");
//    }
//
//    @AfterStep
//    public void teardownStep(){
//        System.out.println("@AfterStep: Running after each step!");
//    }
}

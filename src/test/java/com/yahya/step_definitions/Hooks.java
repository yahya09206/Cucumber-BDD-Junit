package com.yahya.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    /**
     * Class for creating pre- and post-conditions for all of the scenarios and/or steps
     */

    @Before
    public void setupMethod(){
        System.out.println("@Before ---> runs before each scenario");
    }

    @After
    public void teardownMethod(){
        System.out.println("@After ---> runs after each scenario");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("@BeforeStep: Running before each step!");
    }

    @AfterStep
    public void teardownStep(){
        System.out.println("@AfterStep: Running after each step!");
    }
}

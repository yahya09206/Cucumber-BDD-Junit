package com.yahya.runners;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Location of your feature files
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinitions") // Package for step definitions
public class CukesRunner {


}

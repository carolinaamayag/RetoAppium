package com.appium.unittest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        }
)
public class RunTestNG extends AbstractTestNGCucumberTests {
}

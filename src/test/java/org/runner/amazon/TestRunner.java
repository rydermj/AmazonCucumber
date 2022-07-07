package org.runner.amazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources",
glue="org.stepdefinitions.amazon",
dryRun=false,
plugin= {"pretty","html:target/amazon.report"},
monochrome=true)
public class TestRunner {


}

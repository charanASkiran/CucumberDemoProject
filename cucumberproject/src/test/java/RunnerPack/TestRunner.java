package RunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Charan\\eclipse-workspace\\cucumberproject\\Features\\LoginDemoWebshop.feature",glue="stepdefs")


public class TestRunner {

}

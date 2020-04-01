package RunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features="C:\\Users\\Charan\\eclipse-workspace\\cucumberproject\\Features\\Tags.feature",
			glue= {"stepdefs"},
			tags= {" @searchprdcts"},
			monochrome = true,
			plugin= {"pretty","html:target/cucumber-html-report"})


public class TagsRun {

}

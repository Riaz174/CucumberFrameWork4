package Runner4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Feature4/Contact4.Feature"},glue= {"StepDefinition4"},monochrome= true,tags = {"@tag1"}) 

public class Run4 {

}

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Feature",
		glue="stepdefination",
		tags ="@smoke" 
		        )	

public class runner extends AbstractTestNGCucumberTests {
	
	


}

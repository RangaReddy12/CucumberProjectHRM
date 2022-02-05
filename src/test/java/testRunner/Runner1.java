package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(tags= {"@Multipledata"},features= {"FeatureFiles"},glue= {"stepDefination"},monochrome=true,plugin = { "pretty", "html:target/cucumber-reports" })
public class Runner1 extends AbstractTestNGCucumberTests{

}

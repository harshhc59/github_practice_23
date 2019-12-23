package skeleton;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\harsh\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\demoWorkshopLogin.feature",
        glue= {"skeleton"},
        plugin= {"pretty","html:target/cucumber-html-report"}
        
        )




public class RunnerDemo {
	
	

}

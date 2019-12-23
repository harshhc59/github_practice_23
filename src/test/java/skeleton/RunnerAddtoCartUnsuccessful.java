package skeleton;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\harsh\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\CaseStudy4UnsuccessfulCart.feature",
        glue= {"skeleton"},
        plugin= {"pretty","html:target/casestudy4CartUnsuccessful"}
        
        )




public class RunnerAddtoCartUnsuccessful {

}

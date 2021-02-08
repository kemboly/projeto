package test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/resources/features", glue="src/test/java/steps", 
monochrome=true, dryRun = false, plugin = {"json:target/HU01-SolicitarCotacao.json"})
public class SolicitarCotacaoTest {

}

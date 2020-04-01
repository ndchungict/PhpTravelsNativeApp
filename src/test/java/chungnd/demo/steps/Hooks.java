package chungnd.demo.steps;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Before
    public static void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }
}

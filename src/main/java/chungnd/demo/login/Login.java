package chungnd.demo.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private Authenticate authenticated(Actor actor) {
        return Authenticate.as(actor);
    }

    @Override
    @Step("{0} login php travels native application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(authenticated(actor).getEmail()).into(LoginScreen.EMAIL_ET),
                Enter.theValue(authenticated(actor).getPassword()).into(LoginScreen.PASSWORD_ET),
                Click.on(LoginScreen.LOGIN_BTN)
        );
    }

    public static Login withCredentials() {
        return instrumented(Login.class);
    }
}

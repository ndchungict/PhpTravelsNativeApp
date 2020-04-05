package chungnd.demo.steps;

import chungnd.demo.home.HomeScreen;
import chungnd.demo.home.LeftMenu;
import chungnd.demo.login.Authenticate;
import chungnd.demo.login.Login;
import chungnd.demo.login.LoginScreen;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    @Managed(driver = "Appium")
    WebDriver mobileDevice;

    @Given("^that (.*) is on the login screen$")
    public void verify_user_on_th_login_screen(String actorName)throws Throwable{
        OnStage.theActorCalled(actorName).attemptsTo(
                Click.on(HomeScreen.NAVI_ICON),
                Click.on(LeftMenu.LOGIN_REGISTER_MENU),
                Ensure.that(LoginScreen.LOGIN_BTN).isDisplayed()
        );
    }

    @When("^(?:he|she|they) login with valid account$")
    public void login_with_valid_account(DataTable credentials)throws Throwable{
        OnStage.theActorInTheSpotlight().whoCan(Authenticate.with(credentials)).attemptsTo(
                Login.withCredentials()
        );
    }
}

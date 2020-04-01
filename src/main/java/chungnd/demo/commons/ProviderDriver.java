package chungnd.demo.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

/**
 *
 *
 */
public abstract class ProviderDriver<T> {
    @SuppressWarnings("unchecked")
    public T getDriver(Actor actor) {
        return (T) ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
    }
}

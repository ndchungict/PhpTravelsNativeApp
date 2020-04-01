package chungnd.demo.commons.platform;

import chungnd.demo.commons.ProviderDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import net.serenitybdd.screenplay.Actor;

public class AppiumObject extends ProviderDriver<AppiumDriver<MobileElement>> {

    public TouchAction withAction(Actor actor){
        return new TouchAction(getDriver(actor));
    }
}

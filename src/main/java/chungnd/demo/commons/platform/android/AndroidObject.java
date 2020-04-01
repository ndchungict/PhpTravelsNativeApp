package chungnd.demo.commons.platform.android;

import chungnd.demo.commons.ProviderDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.screenplay.Actor;

/**
 *
 *
 */
public class AndroidObject extends ProviderDriver<AndroidDriver<AndroidElement>> {
    public TouchAction withAction(Actor actor){
        return new TouchAction(getDriver(actor));
    }
}

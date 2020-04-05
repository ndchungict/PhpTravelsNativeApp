package chungnd.demo.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LeftMenu {
    public static Target LOGIN_REGISTER_MENU = Target.the("Login/Register Menu")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Login/Register']"))
            .locatedForIOS(MobileBy.xpath(""));
}

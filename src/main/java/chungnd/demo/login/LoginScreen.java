package chungnd.demo.login;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScreen {

    public static Target EMAIL_ET = Target.the("Email Edit Text")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/input_email"))
            .locatedForIOS(MobileBy.xpath(""));

    public static Target PASSWORD_ET = Target.the("Password Edit Text")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/input_password"))
            .locatedForIOS(MobileBy.xpath(""));

    public static Target LOGIN_BTN = Target.the("Login Button")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/btn_login"))
            .locatedForIOS(MobileBy.xpath(""));

    public static Target SIGNUP_LINK = Target.the("Sign Up Link")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/link_signup"))
            .locatedForIOS(MobileBy.xpath(""));
}

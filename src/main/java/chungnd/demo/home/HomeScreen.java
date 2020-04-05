package chungnd.demo.home;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeScreen {
    public static Target NAVI_ICON = Target.the("Navigator Icon")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/naviIcon"))
            .locatedForIOS(MobileBy.xpath(""));

    public static Target SCREEN_TITLE = Target.the("Screen Title")
            .locatedForAndroid(MobileBy.id("com.phptravelsnative:id/NaviText"))
            .locatedForIOS(MobileBy.xpath(""));
}

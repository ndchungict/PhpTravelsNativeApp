package chungnd.demo.commons.platform.android.interactions;

import chungnd.demo.commons.platform.android.AndroidObject;
import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

/**
 *
 *  Hành động ấn bàn phím
 *  e.g: Press.key(AndroidKey.ENTER)
 *
 */
public class Press extends AndroidObject implements Interaction {
    private final AndroidKey key;

    public Press(AndroidKey key) {
        this.key = key;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}

package chungnd.demo.commons.platform.android.interactions;

import chungnd.demo.commons.platform.android.AndroidObject;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 *
 *  Nhập ký tự từ bàn phím ảo
 *  e.g: Press.key(AndroidKey.ENTER)
 *
 */
public class Press extends AndroidObject implements Interaction {
    private final AndroidKey key;

    public Press(AndroidKey key) {
        this.key = key;
    }

    public static final Map<Integer,AndroidKey> KEYS_MAP = Arrays.stream(AndroidKey.values())
            .collect(Collectors.toMap(AndroidKey::getCode,key -> key));

    @Override
    @Step("{0} press on the key #key")
    public <T extends Actor> void performAs(T actor) {
        getDriver(actor).pressKey(new KeyEvent(key));
    }

    public static Interaction key(AndroidKey key) {
        return instrumented(Press.class, key);
    }

    public static Interaction key(int keyCode) {
        return key(KEYS_MAP.get(keyCode));
    }
}

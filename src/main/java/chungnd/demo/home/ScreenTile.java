package chungnd.demo.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ScreenTile implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomeScreen.SCREEN_TITLE).viewedBy(actor).asString();
    }

    public static Question<String> displayed(){
        return new ScreenTile();
    }
}

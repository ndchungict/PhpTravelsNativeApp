package chungnd.demo.login;

import chungnd.demo.commons.exceptions.CannotAuthenticateException;
import cucumber.api.DataTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

import java.util.List;
import java.util.Map;

/**
 * Account Instance
 *
 * @Chungnd
 */
@Getter
@Setter
@AllArgsConstructor
public class Authenticate implements Ability {
    private String email;
    private String password;

    public static Authenticate as(Actor actor){
        if (actor.abilityTo(Authenticate.class)==null){
            throw new CannotAuthenticateException(actor.getName());
        }
        return actor.abilityTo(Authenticate.class);
    }
    
    public static Authenticate with(String email,String password){
        return new Authenticate(email,password);
    }

    public static Authenticate with(DataTable credentials){
        List<Map<String,String>> data = credentials.asMaps(String.class,String.class);
        return new Authenticate(data.get(0).get("email"),data.get(0).get("password"));
    }
}

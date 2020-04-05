package chungnd.demo.commons.exceptions;

public class CannotAuthenticateException extends RuntimeException {
    public CannotAuthenticateException(String actorName) {
        super("The actor " + actorName + " does not have ability to sign in to appllication");
    }
}

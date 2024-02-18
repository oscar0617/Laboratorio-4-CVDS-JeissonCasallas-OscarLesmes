package hangman.model;
import java.awt.*;

/**
 * @author Jeisson Casallas & Oscar Lesmes
 * @version 1.0
 */
public class GameScoreException extends Exception {
    public static final String NEGATIVE_NUMBERS = "Some numbers are negative.";
    public GameScoreException(String message ){
        super( message);
    }
}

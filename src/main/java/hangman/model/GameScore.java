package hangman.model;
import java.awt.*;

/**
 * @author Jeisson Casallas & Oscar Lesmes
 * @version 1.0
 */
public interface GameScore {
    int calculateScore(int correctCount, int incorrectCount);
}

package hangman.model;
import java.awt.*;

public interface GameScore {
    int calculateScore(int correctCount, int incorrectCount);
}

package hangman.model;
import java.awt.*;

public class BonusScore implements GameScore{
    private int score = 0;

    /**
     * @pre Inicia con 0 puntos, puntaje minimo 0
     * @pos Se bonifica con 10 puntos cada letra correcta, se penaliza con -5 puntos letra incorrecta
     * @param correctCount numero de palabras correctas
     * @param incorrectCount numero de palabras incorrectas
     * @return score puntuacion del jugador
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return null;
    }
}
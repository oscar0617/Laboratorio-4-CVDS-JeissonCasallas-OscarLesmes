package hangman.model;
import java.awt.*;

/**
 * @author Jeisson Casallas & Oscar Lesmes
 * @version 1.0
 */
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
        if(correctCount < 0 || incorrectCount < 0){
            score = 0;
        }
        if(correctCount > 0){
            score += 10 * correctCount;
        }
        if(incorrectCount > 0){
            score -= 5 * incorrectCount;
        }
        if(score < 0){
            score = 0;
        }
        return score;
    }
}
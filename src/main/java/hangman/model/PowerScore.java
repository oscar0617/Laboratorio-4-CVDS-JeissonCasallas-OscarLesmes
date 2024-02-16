package hangman.model;
import java.awt.*;


public class PowerScore implements GameScore{
private int score = 0;

    
    /**
     * @pre Inicia con 0 puntos
     * @pos Se bonifica con +5^i por letra correcta y se penaliza con -8 puntos por cada letra incorrecta
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return score puntaje del jugador
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return null;
    }
}


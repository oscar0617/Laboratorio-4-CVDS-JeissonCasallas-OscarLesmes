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
        if(correctCount < 0 || incorrectCount < 0){
            score = 0;
        }
        if(correctCount > 0){
            for(int x = 0; x < correctCount; x++){
                score += Math.pow(5,x+1);
            }
        }
        if(incorrectCount > 0 ){
            score -= 8 * incorrectCount;
        }
        if (score >= 500){ 
            score = 500;
        }
        if (score < 0){
            score = 0;
        }
        return score;
    }
}


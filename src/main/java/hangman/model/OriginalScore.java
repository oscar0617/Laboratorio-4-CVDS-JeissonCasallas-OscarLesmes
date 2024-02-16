package hangman.model;
import java.awt.*;

/**
* @pre Se inicia con 100 puntos, puntaje minimo 0
* @pos Se penaliza con 10 puntos por cada letra incorrecta
* @param CorrectCount numero de letras correctas
* @param IncorrectCount numero de letras incorrectas
* @return score puntuación del jugador
*/
public class OriginalScore implements GameScore{
    private int score = 100;

    /**
    * @pre Se inicia con 100 puntos, puntaje minimo 0
    * @pos Se penaliza con 10 puntos por cada letra incorrecta
    * @param CorrectCount numero de letras correctas
    * @param IncorrectCount numero de letras incorrectas
    * @return score
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        if(correctCount < 0 || incorrectCount < 0){
            score = 100;
        }
        if(incorrectCount > 0){
            score -= incorrectCount * 10;
        }
        if(score < 0){
            score = 0;
        }
        return score;
    }
}

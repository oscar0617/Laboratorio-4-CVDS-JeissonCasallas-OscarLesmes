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
        return null;
    }
}

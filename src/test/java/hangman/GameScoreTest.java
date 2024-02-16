package hangman.test;

import hangman.model.*;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    
    //OriginalScore
    @Test
    public void validOriginScoreCorrectLetters() {
        GameScore game = new OriginalScore();
        int score = game.calculateScore(50,0);
        Assert.assertTrue(score == 100);
    }

    @Test
    public void validOriginScoreLessScore() {
        GameScore game = new OriginalScore();
        int score = game.calculateScore(3,5);
        Assert.assertTrue(score == 50);
    }

    @Test
    public void validOriginScoreMininimumScore()  {
        GameScore game = new OriginalScore();
        int score = game.calculateScore(0, 20);
        Assert.assertTrue(score == 0);
    }

    //BonusScore
    @Test
    public void validBonusScoreZeroLetters(){
        GameScore game = new BonusScore();
        int score = game.calculateScore(0,0);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validBonusScoreCorrectLetters()  {
        GameScore game = new BonusScore();
        int score = game.calculateScore(20,0);
        Assert.assertTrue(score == 200);
    }

    @Test
    public void validBonusScoreCorrectLettersWithPenalty()  {
        GameScore game = new BonusScore();
        int score = game.calculateScore(10,5);
        Assert.assertTrue(score == 75);
    }


    @Test
    public void validBonusScoreCorrectMinimumScore() {
        GameScore game = new BonusScore();
        int score = game.calculateScore(10,20);
        Assert.assertTrue(score == 0);
    }

    //PowerScore
    @Test
    public void validPowerScoreZeroLettersAndZeroIncorrect() {
        GameScore game = new PowerScore();
        int score = game.calculateScore(0,0);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validPowerScoreCorrectLetters() {
        GameScore game = new PowerScore();
        int score = game.calculateScore(3,0);
        Assert.assertTrue(score == 155);
    }

    @Test
    public void validPowerScoreCorrectMinimumScore()  {
        GameScore game = new PowerScore();
        int score = game.calculateScore(0,1);
        Assert.assertTrue(score == 0);
    }

    @Test
    public void validPowerScoreCorrectMaximumScore() {
        GameScore game = new PowerScore();
        int score = game.calculateScore(10,1);
        Assert.assertTrue(score == 500);
    }

    @Test
    public void validPowerScoreCorrectLettersWithPenalty(){
        GameScore game = new PowerScore();
        int score = game.calculateScore(3,1);
        Assert.assertTrue(score == 147);
    }
}

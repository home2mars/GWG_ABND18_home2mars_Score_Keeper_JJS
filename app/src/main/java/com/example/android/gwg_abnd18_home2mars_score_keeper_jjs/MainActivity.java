package com.example.android.gwg_abnd18_home2mars_score_keeper_jjs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This activity keeps track of the Jiu Jitsu competition score for 2 players.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score and advantage for Player with Red band
    private int scoreRed; private int advRed;
    private TextView scoreRedText; private  TextView advRedText;

    // Tracks the score and advantage for Player with Green band
    private int scoreGreen; private int advGreen;
    private TextView scoreGreenText; private  TextView advGreenText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View instances
        scoreRedText = findViewById(R.id.player_red_score);
        advRedText = findViewById(R.id.player_red_adv);
        scoreGreenText = findViewById(R.id.player_green_score);
        advGreenText = findViewById(R.id.player_green_adv);
    }

    /**
     * Increase advantage counter for Player with Red band.
     */
    public void advantageForRed(View v) {
        advRed = advRed + 1;
        displayAdvRed(advRed);
    }

    /**
     * Increase the score for Player with Red band by 2 points.
     */
    public void addTwoForRed(View v) {
        scoreRed = scoreRed + 2;
        displayScoreRed(scoreRed);
    }

    /**
     * Increase the score for Player with Red band by 3 points.
     */
    public void addThreeForRed(View v) {
        scoreRed = scoreRed + 3;
        displayScoreRed(scoreRed);
    }

    /**
     * Increase the score for Player with Red band by 4 points.
     */
    public void addFourForRed(View v) {
        scoreRed = scoreRed + 4;
        displayScoreRed(scoreRed);
    }

    /**
     * Increase advantage counter for Player with Green band.
     */
    public void advantageForGreen(View v) {
        advGreen = advGreen + 1;
        displayAdvGreen(advGreen);
    }


    /**
     * Increase the score for Player with Green band by 2 points.
     */
    public void addTwoForGreen(View v) {
        scoreGreen = scoreGreen + 2;
        displayScoreGreen(scoreGreen);
    }

    /**
     * Increase the score for Player with Green band by 3 points.
     */
    public void addThreeForGreen(View v) {
        scoreGreen = scoreGreen + 3;
        displayScoreGreen(scoreGreen);
    }

    /**
     * Increase the score for Player with Green band by 4 points.
     */
    public void addFourForGreen(View v) {
        scoreGreen = scoreGreen + 4;
        displayScoreGreen(scoreGreen);
    }

    /**
     * Resets the score for both players back to 0.
     */
    public void resetScore(View v) {
        scoreRed = 0; advRed = 0;
        scoreGreen = 0; advGreen = 0;
        displayScoreRed(scoreRed);
        displayAdvRed(advRed);
        displayScoreGreen(scoreGreen);
        displayAdvGreen(advGreen);
    }

    /**
     * Displays the given score for Player with Red band.
     */
    public void displayScoreRed(int score) {
        scoreRedText.setText(String.valueOf(score));
    }

    /**
     * Displays the given advantage for Player with Red band.
     */
    public void displayAdvRed(int score) {
        advRedText.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player with Green band.
     */
    public void displayScoreGreen(int score) {
        scoreGreenText.setText(String.valueOf(score));
    }

    /**
     * Displays the given advantage for Player with Red band.
     */
    public void displayAdvGreen(int score) {
        advGreenText.setText(String.valueOf(score));
    }


}//end of MainActivity.java

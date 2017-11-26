package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Home Team
    int scoreHomeTeam = 0;

    // Tracks the free throw for Home Team
    int free_throwHomeTeam = 0;

    // Tracks the penalties for Home Team
    int penaltiesHomeTeam = 0;

    // Tracks the score for Guest Team
    int scoreGuestTeam = 0;

    // Tracks the free throw for Guest Team
    int free_throwGuestTeam = 0;

    // Tracks the penalties for Guest Team
    int penaltiesGuestTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Home Team by 1 point.
     */
    public void addOneForHome(View v) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeam1(scoreHomeTeam);
    }

    /**
     * Increase the free throw for Home Team by 1 point.
     */
    public void addOneFreeThrowForHome(View v) {
        free_throwHomeTeam = free_throwHomeTeam + 1;
        displayForHomeTeam2(free_throwHomeTeam);
    }

    /**
     * Increase the penalties for Home Team by 1 point.
     */
    public void addOnePenaltyForHome(View v) {
        penaltiesHomeTeam = penaltiesHomeTeam + 1;
        displayForHomeTeam3(penaltiesHomeTeam);
    }

    /**
     * Increase the score for Guest Team by 1 point.
     */
    public void addOneForGuest(View v) {
        scoreGuestTeam = scoreGuestTeam + 1;
        displayForGuestTeam1(scoreGuestTeam);
    }

    /**
     * Increase the free throw for Guest Team by 1 point.
     */
    public void addOneFreeThrowForGuest(View v) {
        free_throwGuestTeam = free_throwGuestTeam + 1;
        displayForGuestTeam2(free_throwGuestTeam);
    }

    /**
     * Increase the penalties for Guest Team by 1 point.
     */
    public void addOnePenaltyForGuest(View v) {
        penaltiesGuestTeam = penaltiesGuestTeam + 1;
        displayForGuestTeam3(penaltiesGuestTeam);
    }

    /**
     * Reset the score, free throw, and penalties for both Home and Guest.
     */
    public void resetAll(View v) {
        scoreHomeTeam = 0;
        free_throwHomeTeam = 0;
        penaltiesHomeTeam = 0;
        scoreGuestTeam = 0;
        free_throwGuestTeam = 0;
        penaltiesGuestTeam = 0;
        displayForHomeTeam1(scoreHomeTeam);
        displayForHomeTeam2(free_throwHomeTeam);
        displayForHomeTeam3(penaltiesHomeTeam);
        displayForGuestTeam1(scoreGuestTeam);
        displayForGuestTeam2(free_throwGuestTeam);
        displayForGuestTeam3(penaltiesGuestTeam);
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given free throw for Home Team.
     */
    public void displayForHomeTeam2(int free_throw) {
        TextView free_throwView = (TextView) findViewById(R.id.home_team_free_throw);
        free_throwView.setText(String.valueOf(free_throw));
    }

    /**
     * Displays the given penalties for Home Team.
     */
    public void displayForHomeTeam3(int penalties) {
        TextView penaltiesView = (TextView) findViewById(R.id.home_team_penalties);
        penaltiesView.setText(String.valueOf(penalties));
    }

    /**
     * Displays the given score for Guest Team.
     */
    public void displayForGuestTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given free throw for Guest Team.
     */
    public void displayForGuestTeam2(int free_throw) {
        TextView free_throwView = (TextView) findViewById(R.id.guest_team_free_throw);
        free_throwView.setText(String.valueOf(free_throw));
    }

    /**
     * Displays the given penalties for Guest Team.
     */
    public void displayForGuestTeam3(int penalties) {
        TextView penaltiesView = (TextView) findViewById(R.id.guest_team_penalties);
        penaltiesView.setText(String.valueOf(penalties));
    }
}

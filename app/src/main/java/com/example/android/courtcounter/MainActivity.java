package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //team A score
    public void threePoints(View v){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoints(View v){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowth(View v){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    //team B score
    public void threePointsB(View v){
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View v){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowthB(View v){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays witch team win.
     */
   public void whichWin(int a,int b) {
       TextView scoreView = (TextView) findViewById(R.id.which_win);
       if (a > b) {
           scoreView.setText(String.valueOf(a));
       } else {
           scoreView.setText(String.valueOf(b));
       }
   }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}

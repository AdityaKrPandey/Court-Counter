package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int pointsTeamA =0;
    public void Pointsadd3A(View v){
        pointsTeamA=pointsTeamA+3;
        displayForTeamA(pointsTeamA);
    }
    public void Pointsadd2A(View v){
        pointsTeamA=pointsTeamA+2;
        displayForTeamA(pointsTeamA);
    }
    public void FreeThrowA(View v){
        pointsTeamA=pointsTeamA+1;
        displayForTeamA(pointsTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    int pointsTeamB =0;
    public void Pointsadd3B(View v){
        pointsTeamB=pointsTeamB+3;
        displayForTeamB(pointsTeamB);
    }
    public void Pointsadd2B(View v){
        pointsTeamB=pointsTeamB+2;
        displayForTeamB(pointsTeamB);
    }
    public void FreeThrowB(View v){
        pointsTeamB=pointsTeamB+1;
        displayForTeamB(pointsTeamB);
    }
    public void Reset(View v) {
        pointsTeamA =0;
        pointsTeamB=0;
        displayForTeamA(pointsTeamA);
        displayForTeamB(pointsTeamB);
    }

}
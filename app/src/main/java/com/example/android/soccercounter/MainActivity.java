package com.example.android.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccercounter.R;

public class MainActivity extends AppCompatActivity {

    public int goalsTeamA = 0;
    public int goalsTeamB = 0;
    public int foulsTeamA = 0;
    public int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds a goal for Team A.
     */
    public void addGoalTeamA(View view){
        goalsTeamA++;
        displayForTeamA();
    }

    /**
     * Adds a goal for Team B.
     */
    public void addGoalTeamB(View view){
        goalsTeamB++;
        displayForTeamB();
    }

    /**
     * Adds a foul for Team A.
     */
    public void addFoulTeamA(View view){
        foulsTeamA++;
        displayForTeamA();
    }

    /**
     * Adds a foul for Team B.
     */
    public void addFoulTeamB(View view){
        foulsTeamB++;
        displayForTeamB();
    }

    /**
     * Resets the app.
     */
    public void reset(View view){
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;

        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Displays the given goals and fouls for Team A.
     */
    public void displayForTeamA() {
        //Show goals
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(goalsTeamA));

        //Show fouls
        scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText("Fouls: " + String.valueOf(foulsTeamA));
    }

    /**
     * Displays the given goals and fouls for Team B.
     */
    public void displayForTeamB() {
        //Show Goals
        TextView view = (TextView) findViewById(R.id.team_b_goals);
        view.setText(String.valueOf(goalsTeamB));

        //Show fouls
        view = (TextView) findViewById(R.id.team_b_fouls);
        view.setText("Fouls: " + String.valueOf(foulsTeamB));
    }
}

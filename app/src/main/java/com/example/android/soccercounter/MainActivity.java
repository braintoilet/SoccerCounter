package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public int goalsTeamA = 0;
    public int goalsTeamB = 0;
    public int foulsTeamA = 0;
    public int foulsTeamB = 0;

    @BindView(R.id.team_a_goals)
    TextView textTeamAGoals;

    @BindView(R.id.team_b_goals)
    TextView textTeamBGoals;

    @BindView(R.id.team_a_fouls)
    TextView textTeamAFouls;

    @BindView(R.id.team_b_fouls)
    TextView textTeamBFouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * Adds a goal for Team A.
     */
    public void addGoalTeamA(View view){
        goalsTeamA++; //add +1

        //Show goals
        textTeamAGoals.setText(String.valueOf(goalsTeamA));
    }

    /**
     * Adds a goal for Team B.
     */
    public void addGoalTeamB(View view){
        goalsTeamB++; //add +1

        //Show goals
        textTeamBGoals.setText(String.valueOf(goalsTeamB));
    }

    /**
     * Adds a foul for Team A.
     */
    public void addFoulTeamA(View view){
        foulsTeamA++; //add +1

        //Show fouls, with formatted string resource
        textTeamAFouls.setText(getString(R.string.fouls, foulsTeamA));
    }

    /**
     * Adds a foul for Team B.
     */
    public void addFoulTeamB(View view){
        foulsTeamB++; //add +1

        //Show fouls, with formatted string resource
        textTeamBFouls.setText(getString(R.string.fouls, foulsTeamB));
    }

    /**
     * Resets the app.
     */
    public void reset(View view){
        //Reset the internal helper variables
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;

        //Reset the textViews back to its default values
        textTeamAGoals.setText(R.string.goals_zero);
        textTeamBGoals.setText(R.string.goals_zero);
        textTeamAFouls.setText(R.string.fouls_zero);
        textTeamBFouls.setText(R.string.fouls_zero);
    }
}

package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScoreForTeamTwo(scoreTeamOne);
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void displayScoreForTeamOne(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_one_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamTwo(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_two_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusOnePointTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 1;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusOnePointTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 1;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void plusTwoPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 2;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusTwoPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 2;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void plusThreePointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 3;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusThreePointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 3;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void plusFourPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 4;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusFourPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 4;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void plusFivePointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 5;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusFivePointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 5;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void plusSixPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne + 6;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void plusSixPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo + 6;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusOnePointTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 1;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusOnePointTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 1;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusTwoPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 2;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusTwoPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 2;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusThreePointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 3;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusThreePointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 3;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusFourPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 4;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusFourPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 4;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusFivePointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 5;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusFivePointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 5;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void minusSixPointsTeamOne(View view)
    {
        scoreTeamOne = scoreTeamOne - 6;
        displayScoreForTeamOne(scoreTeamOne);
    }

    public void minusSixPointsTeamTwo(View view)
    {
        scoreTeamTwo = scoreTeamTwo - 6;
        displayScoreForTeamTwo(scoreTeamTwo);
    }

    public void resetScore(View view)
    {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;

        displayScoreForTeamOne(scoreTeamOne);
        displayScoreForTeamTwo(scoreTeamTwo);
    }
}

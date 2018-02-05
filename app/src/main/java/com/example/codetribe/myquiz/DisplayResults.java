package com.example.codetribe.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);

        Intent intent = getIntent();
        int score = intent.getIntExtra("scoreFinal",-2);
        int correct = intent.getIntExtra("correct",-2);
        int inCorrect = intent.getIntExtra("incorrect",-2);


        TextView viewIncorrect = (TextView)findViewById(R.id.showIncorrect);
        TextView viewCorrect = (TextView)findViewById(R.id.showCorrect);
        TextView viewScore = (TextView)findViewById(R.id.showScore);

        viewScore.setText(String.valueOf(" Your Score is  " + score));
        viewCorrect.setText(String.valueOf(" You Got  " + correct +  "   Correct  "));
        viewIncorrect.setText(String.valueOf(" And  " + inCorrect + "  Incorrrect "));

    }
}

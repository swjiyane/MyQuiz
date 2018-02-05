package com.example.codetribe.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.codetribe.myquiz.QuizActivity.QUIZ_KEY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startQuiz(View view) {

        Intent intent = new Intent(MainActivity.this,QuizActivity.class);

        int id = view.getId();

        if (id == R.id.btnPolitics) {
            intent.putExtra(QUIZ_KEY,"politics");
        } else if ( id == R.id.btnSocial) {
            intent.putExtra(QUIZ_KEY,"social");
        } else if (id == R.id.btnGeneral) {
            intent.putExtra(QUIZ_KEY,"generalknowledge");
        }
        startActivity(intent);
    }
}

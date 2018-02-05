package com.example.codetribe.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {


    public static final String QUIZ_KEY = "quiz_key";

    //score declarations
    public int score = 0;
    public int correct = 0;
    public int inCorrect = 0;


    //politics
    String quiz_type;
    ArrayList<String> questionsPolitics;
    ArrayList<String> correctAnswersPol;
    ArrayList<String> questionsAnswersPol;


    //social
    ArrayList<String> questionsSocial;
    ArrayList<String> correctAnswersSoc;
    ArrayList<String> questionsAnswersSoc;


    //General
    ArrayList<String> questionsGenKnowledge;
    ArrayList<String> correctAnswersGen;
    ArrayList<String> questionsAnswersGen;

    TextView question1, question2, question3, question4, question5;
    RadioButton answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12, answer13, answer14, answer15;


    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        intent = getIntent();
        quiz_type = intent.getStringExtra(QUIZ_KEY);

        //POLITICS
        if ("politics".equals(quiz_type)) {
            Toast.makeText(QuizActivity.this, quiz_type, Toast.LENGTH_LONG).show();
            getSupportActionBar().setTitle(quiz_type);

            RadioGroup rgPolitics = (RadioGroup) findViewById(R.id.questionOneAnswers);

            //Array List for questions
            makeQuestions(quiz_type);


            question1 = (TextView) findViewById(R.id.question1);
            question1.setText(questionsPolitics.get(0));

            question2 = (TextView) findViewById(R.id.question2);
            question2.setText((questionsPolitics.get(1)));

            question3 = (TextView) findViewById(R.id.question3);
            question3.setText((questionsPolitics.get(2)));

            question4 = (TextView) findViewById(R.id.question4);
            question4.setText((questionsPolitics.get(3)));

            question5 = (TextView) findViewById(R.id.question5);
            question5.setText((questionsPolitics.get(4)));


            //Question1

            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer1.setText(correctAnswersPol.get(0));
            answer2.setText(questionsAnswersPol.get(1));
            answer3.setText(questionsAnswersPol.get(2));


            //question 2
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer6 = (RadioButton) findViewById(R.id.answer6);


            answer6.setText(correctAnswersPol.get(1));
            answer5.setText(questionsAnswersPol.get(3));
            answer4.setText(questionsAnswersPol.get(0));


            //question 3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);


            answer8.setText(correctAnswersPol.get(2));
            answer9.setText(questionsAnswersPol.get(5));
            answer7.setText(questionsAnswersPol.get(4));


            //question4

            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);


            answer12.setText(correctAnswersPol.get(3));
            answer10.setText(questionsAnswersPol.get(7));
            answer11.setText(questionsAnswersPol.get(6));


            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);


            answer13.setText(correctAnswersPol.get(4));
            answer14.setText(questionsAnswersPol.get(9));
            answer15.setText(questionsAnswersPol.get(8));


        }

        //SOCIAL
        else if ("social".equals(quiz_type)) {
            Toast.makeText(QuizActivity.this, quiz_type, Toast.LENGTH_LONG).show();
            getSupportActionBar().setTitle("Social");

            makeQuestions(quiz_type);


            question1 = (TextView) findViewById(R.id.question1);
            question1.setText(questionsSocial.get(0));

            question2 = (TextView) findViewById(R.id.question2);
            question2.setText((questionsSocial.get(1)));

            question3 = (TextView) findViewById(R.id.question3);
            question3.setText((questionsSocial.get(2)));

            question4 = (TextView) findViewById(R.id.question4);
            question4.setText((questionsSocial.get(3)));

            question5 = (TextView) findViewById(R.id.question5);
            question5.setText((questionsSocial.get(4)));


            //Question1

            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer3.setText(correctAnswersSoc.get(0));
            answer2.setText(questionsAnswersSoc.get(0));
            answer1.setText(questionsAnswersSoc.get(1));


            //question2
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer6 = (RadioButton) findViewById(R.id.answer6);

            //setting of answers on radio buttons
            answer5.setText(correctAnswersSoc.get(1));
            answer4.setText(questionsAnswersSoc.get(2));
            answer6.setText(questionsAnswersSoc.get(3));


            //question3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);

            //setting of answers on radio buttons
            answer8.setText(correctAnswersSoc.get(2));
            answer7.setText(questionsAnswersSoc.get(4));
            answer9.setText(questionsAnswersSoc.get(5));


            //question4
            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);

            //setting of answers on radio buttons
            answer11.setText(correctAnswersSoc.get(3));
            answer10.setText(questionsAnswersSoc.get(6));
            answer12.setText(questionsAnswersSoc.get(7));


            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);

            //setting of answers on radio buttons
            answer13.setText(correctAnswersSoc.get(4));
            answer14.setText(questionsAnswersSoc.get(8));
            answer15.setText(questionsAnswersSoc.get(9));


        }

        //GENERAL KNOWLEDGE
        else if ("generalknowledge".equals(quiz_type)) {
            Toast.makeText(QuizActivity.this, quiz_type, Toast.LENGTH_LONG).show();
            getSupportActionBar().setTitle("General Knowledge");

            makeQuestions(quiz_type);


            question1 = (TextView) findViewById(R.id.question1);
            question1.setText(questionsGenKnowledge.get(0));

            question2 = (TextView) findViewById(R.id.question2);
            question2.setText((questionsGenKnowledge.get(1)));

            question3 = (TextView) findViewById(R.id.question3);
            question3.setText((questionsGenKnowledge.get(2)));

            question4 = (TextView) findViewById(R.id.question4);
            question4.setText((questionsGenKnowledge.get(3)));

            question5 = (TextView) findViewById(R.id.question5);
            question5.setText((questionsGenKnowledge.get(4)));


            //Question1

            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer3.setText(correctAnswersGen.get(0));
            answer2.setText(questionsAnswersGen.get(0));
            answer1.setText(questionsAnswersGen.get(1));


            //question2
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer6 = (RadioButton) findViewById(R.id.answer6);

            //setting of answers on radio buttons
            answer5.setText(correctAnswersGen.get(1));
            answer4.setText(questionsAnswersGen.get(2));
            answer6.setText(questionsAnswersGen.get(3));

            //question3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);

            //setting of answers on radio buttons
            answer8.setText(correctAnswersGen.get(2));
            answer7.setText(questionsAnswersGen.get(4));
            answer9.setText(questionsAnswersGen.get(5));

            //question4
            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);

            //setting of answers on radio buttons
            answer11.setText(correctAnswersGen.get(3));
            answer10.setText(questionsAnswersGen.get(6));
            answer12.setText(questionsAnswersGen.get(7));

            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);

            //setting of answers on radio buttons
            answer13.setText(correctAnswersGen.get(4));
            answer14.setText(questionsAnswersGen.get(8));
            answer15.setText(questionsAnswersGen.get(9));


        }


    }


    public void submitScore(View view) {
        Intent intent = getIntent();
        quiz_type = intent.getStringExtra(QUIZ_KEY);


        //POLITICS
        if ("politics".equals(quiz_type)) {
            Toast.makeText(QuizActivity.this, quiz_type, Toast.LENGTH_LONG).show();
            getSupportActionBar().setTitle("Politics");

            RadioGroup rgPolitics = (RadioGroup) findViewById(R.id.questionOneAnswers);


            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer1.setText(correctAnswersPol.get(0));
            answer2.setText(questionsAnswersPol.get(1));
            answer3.setText(questionsAnswersPol.get(2));
/*
            if (rgPolitics.getCheckedRadioButtonId() == answer1.getId()) {

            }*/

            //if statement for adding up score
            if (answer1.isChecked()) {
                if (answer1.getText().toString().equals(correctAnswersPol.get(0))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer2.isChecked()) {
                if (answer2.getText().toString().equals(questionsAnswersPol.get(1))) {
                    addIncorrect();
                }
            } else if (answer3.isChecked()) {
                if (answer3.getText().toString().equals(questionsAnswersPol.get(2))) {

                    addIncorrect();
                }
            }

            //question 2
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer6 = (RadioButton) findViewById(R.id.answer6);

            answer6.setText(correctAnswersPol.get(1));
            answer5.setText(questionsAnswersPol.get(3));
            answer4.setText(questionsAnswersPol.get(0));

            if (answer6.isChecked()) {
                if (answer6.getText().toString().equals(correctAnswersPol.get(1))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer5.isChecked()) {
                if (answer5.getText().toString().equals(correctAnswersPol.get(1))) {

                    addIncorrect();
                }
            } else if (answer4.isChecked()) {
                if (answer4.getText().toString().equals(correctAnswersPol.get(1))) {

                    addIncorrect();
                }
            }

            //question 3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);


            answer8.setText(correctAnswersPol.get(2));
            answer9.setText(questionsAnswersPol.get(5));
            answer7.setText(questionsAnswersPol.get(4));

            if (answer8.isChecked()) {
                if (answer8.getText().toString().equals(correctAnswersPol.get(2))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer7.isChecked()) {
                if (answer7.getText().toString().equals(questionsAnswersPol.get(5))) {

                    addIncorrect();
                }
            } else if (answer9.isChecked()) {
                if (answer9.getText().toString().equals(questionsAnswersPol.get(4))) {
                    addIncorrect();

                }
            }

            //question4

            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);


            answer12.setText(correctAnswersPol.get(3));
            answer10.setText(questionsAnswersPol.get(7));
            answer11.setText(questionsAnswersPol.get(6));

            if (answer12.isChecked()) {
                if (answer12.getText().toString().equals(correctAnswersPol.get(3))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer10.isChecked()) {
                if (answer10.getText().toString().equals(questionsAnswersPol.get(7))) {

                    addIncorrect();
                }
            } else if (answer11.isChecked()) {
                if (answer11.getText().toString().equals(questionsAnswersPol.get(6))) {
                    addIncorrect();

                }
            }

            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);


            answer13.setText(correctAnswersPol.get(4));
            answer14.setText(questionsAnswersPol.get(9));
            answer15.setText(questionsAnswersPol.get(8));

            if (answer13.isChecked()) {
                if (answer13.getText().toString().equals(correctAnswersPol.get(4))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer14.isChecked()) {
                if (answer14.getText().toString().equals(questionsAnswersPol.get(9))) {

                    addIncorrect();
                }
            } else if (answer15.isChecked()) {
                if (answer15.getText().toString().equals(questionsAnswersPol.get(8))) {

                    addIncorrect();
                }
            }

        }

        //SOCIAL
        else if ("social".equals(quiz_type)) {


            //Question1

            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer3.setText(correctAnswersSoc.get(0));
            answer2.setText(questionsAnswersSoc.get(0));
            answer1.setText(questionsAnswersSoc.get(1));

            //if statement for adding up score
            if (answer3.isChecked()) {
                if (answer3.getText().toString().equals(correctAnswersSoc.get(0))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer2.isChecked()) {
                if (answer2.getText().toString().equals(questionsAnswersPol.get(0))) {

                    addIncorrect();
                }
            } else if (answer1.isChecked()) {
                if (answer1.getText().toString().equals(questionsAnswersPol.get(1))) {

                    addIncorrect();
                }
            }

            //question2
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer6 = (RadioButton) findViewById(R.id.answer6);

            //setting of answers on radio buttons
            answer5.setText(correctAnswersSoc.get(1));
            answer4.setText(questionsAnswersSoc.get(2));
            answer6.setText(questionsAnswersSoc.get(3));

            //if statement for adding up score
            if (answer5.isChecked()) {
                if (answer5.getText().toString().equals(correctAnswersSoc.get(1))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer4.isChecked()) {
                if (answer4.getText().toString().equals(questionsAnswersPol.get(2))) {

                    addIncorrect();
                }
            } else if (answer6.isChecked()) {
                if (answer6.getText().toString().equals(questionsAnswersPol.get(3))) {

                    addIncorrect();
                }
            }

            //question3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);

            //setting of answers on radio buttons
            answer8.setText(correctAnswersSoc.get(2));
            answer7.setText(questionsAnswersSoc.get(4));
            answer9.setText(questionsAnswersSoc.get(5));

            //if statement for adding up score
            if (answer8.isChecked()) {
                if (answer8.getText().toString().equals(correctAnswersSoc.get(2))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer7.isChecked()) {
                if (answer7.getText().toString().equals(questionsAnswersPol.get(4))) {

                    addIncorrect();
                }
            } else if (answer9.isChecked()) {
                if (answer9.getText().toString().equals(questionsAnswersPol.get(5))) {

                    addIncorrect();
                }
            }
            //question4
            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);

            //setting of answers on radio buttons
            answer11.setText(correctAnswersSoc.get(3));
            answer10.setText(questionsAnswersSoc.get(6));
            answer12.setText(questionsAnswersSoc.get(7));

            //if statement for adding up score
            if (answer11.isChecked()) {
                if (answer11.getText().toString().equals(correctAnswersSoc.get(3))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer10.isChecked()) {
                if (answer10.getText().toString().equals(questionsAnswersPol.get(6))) {

                    addIncorrect();
                }
            } else if (answer12.isChecked()) {
                if (answer12.getText().toString().equals(questionsAnswersPol.get(7))) {

                    addIncorrect();
                }
            }
            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);

            //setting of answers on radio buttons
            answer13.setText(correctAnswersSoc.get(4));
            answer14.setText(questionsAnswersSoc.get(8));
            answer15.setText(questionsAnswersSoc.get(9));

            //if statement for adding up score
            if (answer13.isChecked()) {
                if (answer13.getText().toString().equals(correctAnswersSoc.get(4))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer14.isChecked()) {
                if (answer14.getText().toString().equals(questionsAnswersSoc.get(8))) {

                    addIncorrect();
                }
            } else if (answer15.isChecked()) {
                if (answer15.getText().toString().equals(questionsAnswersSoc.get(9))) {

                    addIncorrect();
                }
            }

        }

        //GENERAL KNOWLEDGE
        else if ("generalknowledge".equals(quiz_type)) {

            //Question1

            answer1 = (RadioButton) findViewById(R.id.answer1);
            answer2 = (RadioButton) findViewById(R.id.answer2);
            answer3 = (RadioButton) findViewById(R.id.answer3);

            //setting of answers on radio buttons
            answer3.setText(correctAnswersGen.get(0));
            answer2.setText(questionsAnswersGen.get(0));
            answer1.setText(questionsAnswersGen.get(1));

            //if statement for adding up score
            if (answer3.isChecked()) {
                if (answer3.getText().toString().equals(correctAnswersGen.get(0))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer2.isChecked()) {
                if (answer2.getText().toString().equals(questionsAnswersGen.get(0))) {
                    addIncorrect();

                }
            } else if (answer1.isChecked()) {
                if (answer1.getText().toString().equals(questionsAnswersGen.get(1))) {

                    addIncorrect();
                }
            }

            //question2
            answer5 = (RadioButton) findViewById(R.id.answer5);
            answer4 = (RadioButton) findViewById(R.id.answer4);
            answer6 = (RadioButton) findViewById(R.id.answer6);

            //setting of answers on radio buttons
            answer5.setText(correctAnswersGen.get(1));
            answer4.setText(questionsAnswersGen.get(2));
            answer6.setText(questionsAnswersGen.get(3));

            //if statement for adding up score
            if (answer5.isChecked()) {
                if (answer5.getText().toString().equals(correctAnswersGen.get(1))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer4.isChecked()) {
                if (answer4.getText().toString().equals(questionsAnswersGen.get(2))) {

                    addIncorrect();
                }
            } else if (answer6.isChecked()) {
                if (answer6.getText().toString().equals(questionsAnswersGen.get(3))) {

                    addIncorrect();
                }
            }

            //question3
            answer7 = (RadioButton) findViewById(R.id.answer7);
            answer8 = (RadioButton) findViewById(R.id.answer8);
            answer9 = (RadioButton) findViewById(R.id.answer9);

            //setting of answers on radio buttons
            answer8.setText(correctAnswersGen.get(2));
            answer7.setText(questionsAnswersGen.get(4));
            answer9.setText(questionsAnswersGen.get(5));

            //if statement for adding up score
            if (answer8.isChecked()) {
                if (answer8.getText().toString().equals(correctAnswersGen.get(2))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer7.isChecked()) {
                if (answer7.getText().toString().equals(questionsAnswersGen.get(4))) {
                    addIncorrect();

                }
            } else if (answer9.isChecked()) {
                if (answer9.getText().toString().equals(questionsAnswersGen.get(5))) {
                    addIncorrect();
                }
            }
            //question4
            answer10 = (RadioButton) findViewById(R.id.answer10);
            answer11 = (RadioButton) findViewById(R.id.answer11);
            answer12 = (RadioButton) findViewById(R.id.answer12);

            //setting of answers on radio buttons
            answer11.setText(correctAnswersGen.get(3));
            answer10.setText(questionsAnswersGen.get(6));
            answer12.setText(questionsAnswersGen.get(7));

            //if statement for adding up score
            if (answer11.isChecked()) {
                if (answer11.getText().toString().equals(correctAnswersGen.get(3))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer10.isChecked()) {
                if (answer10.getText().toString().equals(questionsAnswersGen.get(6))) {
                    addIncorrect();
                }
            } else if (answer12.isChecked()) {
                if (answer12.getText().toString().equals(questionsAnswersGen.get(7))) {
                    addIncorrect();
                }
            }
            //question5
            answer13 = (RadioButton) findViewById(R.id.answer13);
            answer14 = (RadioButton) findViewById(R.id.answer14);
            answer15 = (RadioButton) findViewById(R.id.answer15);

            //setting of answers on radio buttons
            answer13.setText(correctAnswersGen.get(4));
            answer14.setText(questionsAnswersGen.get(8));
            answer15.setText(questionsAnswersGen.get(9));

            //if statement for adding up score
            if (answer13.isChecked()) {
                if (answer13.getText().toString().equals(correctAnswersGen.get(4))) {
                    calculateScore();
                    addCorrect();
                }
            } else if (answer14.isChecked()) {
                if (answer14.getText().toString().equals(questionsAnswersGen.get(8))) {
                    addIncorrect();
                }
            } else if (answer15.isChecked()) {
                if (answer15.getText().toString().equals(questionsAnswersGen.get(9))) {
                    addIncorrect();
                }
            }

        }


        // Toast.makeText(QuizActivity.this, "Score : "+score,Toast.LENGTH_LONG).show();

        // Intent Secondintent = new Intent(QuizActivity.this,DisplayResults.class);
        String scoreFinal = String.valueOf(score);
        // Secondintent.putExtra("scoreFinal",String.valueOf(score));
        // startActivity(Secondintent);

        intent = new Intent(QuizActivity.this, DisplayResults.class);
        intent.putExtra("scoreFinal", score);
        intent.putExtra("incorrect", inCorrect);
        intent.putExtra("correct", correct);
        startActivity(intent);


    }


    public void calculateScore() {
        score = score + 1;

    }

    public void addCorrect() {
        correct += 1;
    }

    public void addIncorrect() {
        inCorrect += 1;
    }


    public void makeQuestions(String quiz_type) {


        if ("politics".equals(quiz_type)) {
            //Array for correct answers

            questionsPolitics = new ArrayList<>();

            questionsPolitics.add("Who is the Minister of Police?");
            questionsPolitics.add("Who is the Minister of Education?");
            questionsPolitics.add("Who is the Minister of Home Affairs?");
            questionsPolitics.add("Who is the Minister of Finance?");
            questionsPolitics.add("Who is the President of SA?");

            correctAnswersPol = new ArrayList<>();

            correctAnswersPol.add("Fikile Mbalula");
            correctAnswersPol.add("Angie Motshekga");
            correctAnswersPol.add("Hlengiwe Mkhize");
            correctAnswersPol.add("Melusi Gigaba");
            correctAnswersPol.add("Jacob Zuma");

            //Array for possible answers

            //Declaration for the array list possible answers
            questionsAnswersPol = new ArrayList<>();

            questionsAnswersPol.add("Naledi Pandor");
            questionsAnswersPol.add("Pravin Gordon");
            questionsAnswersPol.add("Thoko Didiza");
            questionsAnswersPol.add("Nelson Mandela");
            questionsAnswersPol.add("Nkosinathi Nhleko");
            questionsAnswersPol.add("Melusi Gandi");
            questionsAnswersPol.add("Hellen Zille");
            questionsAnswersPol.add("Kgalema Motlante");
            questionsAnswersPol.add("Julius Malema");
            questionsAnswersPol.add("Blade Nzimande");
            questionsAnswersPol.add("Mmusi Maimane");


        } else if ("social".equals(quiz_type)) {

            questionsSocial = new ArrayList<>();

            questionsSocial.add("Which song won the song of the year 2015/2016 at the SAMA?");
            questionsSocial.add("Which Team won the PSL ABSA premier League?");
            questionsSocial.add("A disabled deejay who travels all around the world?");
            questionsSocial.add("The historical movie biography movie Kalushi is about?");
            questionsSocial.add("Who filled up Orlando Stadium and sold Gold?");

            //Array for correct answers


            correctAnswersSoc = new ArrayList<>();

            correctAnswersSoc.add("Fikile Mbalula");
            correctAnswersSoc.add("Mamelodi Sundowns");
            correctAnswersSoc.add("Deejay BlackCoffee");
            correctAnswersSoc.add("Solomon Mahlangu");
            correctAnswersSoc.add("Casper Nyovest");

            //Array for possible answers

            //Declaration for the array list possible answers
            questionsAnswersSoc = new ArrayList<>();

            questionsAnswersSoc.add("wat wat");
            questionsAnswersSoc.add("wat");
            questionsAnswersSoc.add("Orlando Pirates");
            questionsAnswersSoc.add("Kaizer Chiefs");
            questionsAnswersSoc.add("Deejay Fresh");
            questionsAnswersSoc.add("Deejay Ganyani");
            questionsAnswersSoc.add("Chris Hani");
            questionsAnswersSoc.add("Oliver Tambo");
            questionsAnswersSoc.add("AKA");
            questionsAnswersSoc.add("KO");


        } else if ("generalknowledge".equals(quiz_type)) {
            questionsGenKnowledge = new ArrayList<>();

            questionsGenKnowledge.add("Who called South Africa the Rainbow Nation?");
            questionsGenKnowledge.add("South Africa has 3 Capital Cities and Pretoria is known for?");
            questionsGenKnowledge.add("What is South African biggest export?");
            questionsGenKnowledge.add("Which popular cold drink was created in South Africa?");
            questionsGenKnowledge.add("Youth Day is celebrated on the 16th June to commemorate what?");

            //Array for correct answers


            correctAnswersGen = new ArrayList<>();

            correctAnswersGen.add("Desmond Tutu");
            correctAnswersGen.add("Administrative");
            correctAnswersGen.add("Gold");
            correctAnswersGen.add("Appletiser");
            correctAnswersGen.add("Youth day");

            //Array for possible answers

            //Declaration for the array list possible answers
            questionsAnswersGen = new ArrayList<>();

            questionsAnswersGen.add("Nelson Mandela");
            questionsAnswersGen.add("Thabo Mbeki");
            questionsAnswersGen.add("Legislative");
            questionsAnswersGen.add("Judical");
            questionsAnswersGen.add("Diamond");
            questionsAnswersGen.add("Coal");
            questionsAnswersGen.add("Coca Cola");
            questionsAnswersGen.add("Stoney Ginger Beer");
            questionsAnswersGen.add("Day of Goodwill");
            questionsAnswersGen.add("Workers Day");


        }
    }

}
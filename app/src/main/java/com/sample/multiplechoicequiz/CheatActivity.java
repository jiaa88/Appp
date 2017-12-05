package com.sample.multiplechoicequiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by NetCity on 5/12/2017.
 */

public class CheatActivity extends AppCompatActivity {


    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mAnswerTextView;
    private TextView showAnswer;
    private Button mShowAnswer;
    private TextView mQuestionView;  //current question to answer

    private int mQuestionNumber = 0; // current question number


    private static final String EXTRA_ANSWER_IS_TRUE =
            "com.sample.multiplechoicequiz.answer_is_true";

    public static Intent newIntent(Context packageContext, boolean answerIsTrue) {
        Intent i = new Intent(packageContext, CheatActivity.class);
        i.putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue);
        return i;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);



        mQuestionView = (TextView) findViewById(R.id.question);
    }

    private void updateanswer() {
        // check if we are not outside array bounds for questions

            if(mQuestionNumber<mQuestionLibrary.getLength() ){
                // set the text for new question, and new 4 alternative to answer on four buttons
                if(mQuestionNumber==1){
                    showAnswer = (TextView) findViewById(R.id.answer1);
                }
                else if(mQuestionNumber==2){
                    showAnswer = (TextView) findViewById(R.id.answer2);
                }
                else if(mQuestionNumber==3){
                    showAnswer = (TextView) findViewById(R.id.answer3);
                }
                else if(mQuestionNumber==4){
                    showAnswer = (TextView) findViewById(R.id.answer4);
                }


            }
            mQuestionNumber++;



    }



}

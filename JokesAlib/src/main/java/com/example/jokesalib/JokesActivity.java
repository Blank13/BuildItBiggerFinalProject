package com.example.jokesalib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    private TextView jokeTextView;
    public static String jokeIntentKey = "JOKE_INTENT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        String joke = getIntent().getStringExtra(jokeIntentKey);
        jokeTextView.setText(joke);
    }

}

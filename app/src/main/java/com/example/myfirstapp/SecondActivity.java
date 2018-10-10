package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber()
    {
        // get text view where random number will be displayed
        TextView randomView = (TextView)findViewById(R.id.textview_random);

        // get the text view where the heading is displayed
        TextView headingView = (TextView)findViewById(R.id.textview_label);

        // get count from intent extras
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        // generate a random number
        Random random = new Random();
        int randomInt = 0;
        if(count > 0)
        {
            randomInt = random.nextInt(count);
        }

        // display the random number
        randomView.setText(Integer.toString(randomInt));

        // substitute the max val (count) into the string resource
        // for the heading, and update the heading
        headingView.setText(getString(R.string.random_heading, count));

    }
}

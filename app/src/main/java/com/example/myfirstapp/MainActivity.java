package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view)
    {
        TextView showCountTextView = (TextView)findViewById(R.id.textView);

        showCountTextView.setText("0");

        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Reset count to 0", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view)
    {
        // get the text view
        TextView showCountTextView = (TextView)findViewById(R.id.textView);

        // get the value of the text view, convert to int, increment it
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;

        // display in text view
        showCountTextView.setText(count.toString());
    }


    public void randomMe(View view)
    {
        TextView showCountTextView = (TextView)findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);

        // create an intent to start second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        randomIntent.putExtra(TOTAL_COUNT, count);

        // start new activity
        startActivity(randomIntent);

    }
}

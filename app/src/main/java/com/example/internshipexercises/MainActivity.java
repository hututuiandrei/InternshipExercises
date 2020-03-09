package com.example.internshipexercises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    public static final String VALUE_INCREMENT = "tag";
    private int incrementValue = 0;
    private TextView mTextViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        if(savedInstanceState != null) {

            incrementValue = savedInstanceState.getInt(VALUE_INCREMENT);
            mTextViewCounter.setText(String.valueOf(incrementValue));
        }
        Log.d(TAG, String.valueOf(incrementValue));

        Log.d(TAG, "Happy to be born");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG, String.valueOf(incrementValue));
        outState.putInt(VALUE_INCREMENT, incrementValue);
    }

    private void initView() {

        mTextViewCounter = findViewById(R.id.counter_value_text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onCreate: Happy to be started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: Preparing final UI changes for you master");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: I exist, but you cannot see me");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: Packing up to leave");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: Bye bye");
    }

    public void clickedButton(View view) {

        incrementValue++;
        mTextViewCounter.setText(String.valueOf(incrementValue));
    }
}

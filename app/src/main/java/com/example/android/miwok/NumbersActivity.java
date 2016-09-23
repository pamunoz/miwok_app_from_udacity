package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        // Create an array of words
        String[] arrayWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};



        ArrayList<String> words = new ArrayList<>();

        for (String word : arrayWords) {
            words.add(word);
        }

        for (int i = 0; i < words.size(); i++) {
            Log.v(TAG, "Word at index " + i + ": " + words.get(i));
        }
    }
}

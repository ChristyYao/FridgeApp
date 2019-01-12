package com.example.company.fridgeapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        introCheck();
    }

    public void introCheck() {
        /* Uncomment this line to get the intro back */
        PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().remove("firstStart").apply();

        /* Declare a new thread to do a preference check */
        Thread thread = new Thread(() -> {

            /* Initialize SharedPreferences */
            SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

            /* Create a new boolean and preference and set it to true */
            boolean isFirstStart = getPrefs.getBoolean("firstStart", true);

            /* If the activity has never started before... */
            if (isFirstStart) {
                /* Launch app intro */
                runOnUiThread(() -> startActivity(new Intent(this, IntroActivity.class)));

                /* Make a new preferences editor */
                SharedPreferences.Editor e = getPrefs.edit();

                /* Edit preference to make it false because we don't want this to run again */
                e.putBoolean("firstStart", false);

                /* Apply the changes */
                e.apply();
            }
        });

        /* Start the thread */
        thread.start();
    }

}



package com.example.company.fridgeapp;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle("Welcome to FridgeApp");
        sliderPage1.setDescription("Where food is kept safe.");
        sliderPage1.setImageDrawable(R.drawable.appintro_indicator_dot_white);
        sliderPage1.setBgColor(getResources().getColor(R.color.colorAccent));
        addSlide(AppIntroFragment.newInstance(sliderPage1));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("Food");
        sliderPage2.setDescription("Food Text Here");
        sliderPage2.setImageDrawable(R.drawable.appintro_indicator_dot_white);
        sliderPage2.setBgColor(getResources().getColor(R.color.colorAccent));
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("Fridge");
        sliderPage3.setDescription("Fridge Stuff Here.");
        sliderPage3.setImageDrawable(R.drawable.appintro_indicator_dot_white);
        sliderPage3.setBgColor(getResources().getColor(R.color.colorAccent));
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        SliderPage sliderPage4 = new SliderPage();
        sliderPage4.setTitle("Freezer");
        sliderPage4.setDescription("Freezer Stuff Here");
        sliderPage4.setImageDrawable(R.drawable.appintro_indicator_dot_white);
        sliderPage4.setBgColor(getResources().getColor(R.color.colorAccent));
        addSlide(AppIntroFragment.newInstance(sliderPage4));

        SliderPage sliderPage7 = new SliderPage();
        sliderPage7.setTitle("You're all set");
        sliderPage7.setDescription("Welcome to FridgeApp.");
        sliderPage7.setImageDrawable(R.drawable.appintro_indicator_dot_white);
        sliderPage7.setBgColor(getResources().getColor(R.color.colorAccent));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent i = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent i = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

}
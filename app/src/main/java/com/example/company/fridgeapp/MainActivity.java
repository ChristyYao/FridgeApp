package com.example.company.fridgeapp;

import android.graphics.Color;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.company.fridgeapp.adapter.ItemAdapter;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ItemAdapter itemAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Objects.requireNonNull(getSupportActionBar()).hide();

        initNavBar();

        itemAdapter = new ItemAdapter();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemAdapter);
    }

    private void initNavBar() {
        AHBottomNavigation bottomNavigation = findViewById(R.id.nav_bar);

        // Create items
        // Food, Shopping List, Account
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.app_name, R.drawable.ic_food, R.color.colorPrimary);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.app_name, R.drawable.ic_shopping, R.color.colorPrimary);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.app_name, R.drawable.ic_account, R.color.colorPrimary);

        // Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

        // Set background color
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

        // Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);

        // Change colors
        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
        bottomNavigation.setInactiveColor(Color.parseColor("#747474"));

        // Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

        // Display color under navigation bar (API 21+)
        // Don't forget these lines in your style-v21
        // <item name="android:windowTranslucentNavigation">true</item>
        // <item name="android:fitsSystemWindows">true</item>
        bottomNavigation.setTranslucentNavigationEnabled(true);

        // Manage titles
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE);
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);

        // Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);

        // Set current item programmatically
        bottomNavigation.setCurrentItem(1);

        // Set listeners
        bottomNavigation.setOnTabSelectedListener((position, wasSelected) -> {
            // Do something cool here...
            return true;
        });
        bottomNavigation.setOnNavigationPositionListener(y -> {
            // Manage the new y position
        });
    }

}



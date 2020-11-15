package com.example.discreteseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] numbers={"1", "2", "3", "4", "5", "6","7","8","9"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.linearlayout1);

        for (int i = 0; i < numbers.length; i++) {
            View view = new View(this);
            view.setLayoutParams(new TableLayout.LayoutParams(0, 1, 1f));
            linearLayout.addView(view);

            TextView textview = new TextView(this);
            textview.setText(numbers[i]);
            textview.setTextColor(Color.BLACK);
            textview.setTextSize(10);
            textview.setId(i);
            textview.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            linearLayout.addView(textview);
        }

    }
}
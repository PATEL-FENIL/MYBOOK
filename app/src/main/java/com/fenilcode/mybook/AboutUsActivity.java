package com.fenilcode.mybook;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Find the TextView in your layout
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView aboutUsTextView = findViewById(R.id.aboutUsTextView);

        // Set the text content
        aboutUsTextView.setText(getString(R.string.about_us_content));
    }
}

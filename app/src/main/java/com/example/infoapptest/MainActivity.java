package com.example.infoapptest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mercury).setOnClickListener(v -> {
            openDetailScreen(0);
        });
        findViewById(R.id.venus).setOnClickListener(v -> {
            openDetailScreen(1);
        });
        findViewById(R.id.earth).setOnClickListener(v -> {
            openDetailScreen(2);
        });
        findViewById(R.id.mars).setOnClickListener(v -> {
            openDetailScreen(3);
        });
        findViewById(R.id.jupiter).setOnClickListener(v -> {
            openDetailScreen(4);
        });
        findViewById(R.id.saturn).setOnClickListener(v -> {
            openDetailScreen(5);
        });
        findViewById(R.id.uranus).setOnClickListener(v -> {
            openDetailScreen(6);
        });
        findViewById(R.id.neptune).setOnClickListener(v -> {
            openDetailScreen(7);
        });
    }

    private void openDetailScreen(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("POS", pos);
        startActivity(intent);
    }
}
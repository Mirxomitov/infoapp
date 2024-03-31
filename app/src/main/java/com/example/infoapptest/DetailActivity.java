package com.example.infoapptest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int pos = getIntent().getIntExtra("POS", 0);

        TextView title = findViewById(R.id.detail_title);
        ImageView image = findViewById(R.id.detail_image);
        TextView description = findViewById(R.id.detail_description);

        title.setText(PlanetsAdapter.planets.get(pos).getName());
        image.setImageResource(PlanetsAdapter.planets.get(pos).getImageResId());
        description.setText(PlanetsAdapter.planets.get(pos).getDescription());

        findViewById(R.id.detail_back).setOnClickListener(v -> {
            finish();
        });

        findViewById(R.id.changeSize).setOnClickListener(v -> {
            float currentSize = description.getTextSize();
            float newSize = currentSize + 2;
            if (newSize >= 38) newSize = 18f;
            Log.d("TTT", String.valueOf(newSize));

            description.setTextSize(TypedValue.COMPLEX_UNIT_PX, newSize);
        });
    }
}
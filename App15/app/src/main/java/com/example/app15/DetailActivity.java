package com.example.app15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView date,states,positive,recover,death,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        date = findViewById(R.id.detaildate);
        states = findViewById(R.id.states);
        positive = findViewById(R.id.positive);
        recover = findViewById(R.id.recover);
        death = findViewById(R.id.death);
        total = findViewById(R.id.total);
        Intent i = getIntent();
        String[] data = i.getStringArrayExtra("data");
        date.setText(data[0]);
        states.setText(data[1]);
        positive.setText(data[2]);
        death.setText(data[3]);
        total.setText(data[4]);
    }
}
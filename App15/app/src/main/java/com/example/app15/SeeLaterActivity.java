package com.example.app15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeeLaterActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_later);
        textView = findViewById(R.id.textView2);
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(getApplicationContext());
        recyclerView = findViewById(R.id.recyclerview2);
        AdapterDownload adapterDownload = new AdapterDownload(SeeLaterActivity.this,databaseHelper.dataCovidDao().getAll());
        recyclerView.setAdapter(adapterDownload);
        recyclerView.setLayoutManager(new LinearLayoutManager(SeeLaterActivity.this));
    }
}
package com.example.app15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    AdapterCovid adapterCovid;
    Button seelater;
    RecyclerView recyclerView;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<Example> list = new ArrayList<>();
        setContentView(R.layout.activity_main);
        seelater = findViewById(R.id.seelater);
        recyclerView = findViewById(R.id.recyclerview);
        searchView = findViewById(R.id.search_view);
        MyApiEndPointInterface myApiEndPointInterface = RetrofitInstance.getRetrofit().create(MyApiEndPointInterface.class);
        Call<List<Example>> listdata = myApiEndPointInterface.getExample();
        listdata.enqueue(new Callback<List<Example>>() {
            @Override
            public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
                if (response.isSuccessful() && response.body()!= null) {
                    list.addAll(response.body());
                    AdapterCovid adapterCovid = new AdapterCovid(MainActivity.this, list);
                    recyclerView.setAdapter(adapterCovid);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                }
            }

            @Override
            public void onFailure(Call<List<Example>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failure",Toast.LENGTH_SHORT).show();
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                filter(query, list);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ;
                return true;
            }
        });
        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                AdapterCovid adapterCovid = new AdapterCovid(MainActivity.this,list);
                recyclerView.setAdapter(adapterCovid);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                return true;
            }
        });
        seelater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SeeLaterActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
        private void filter(String newText, List<Example> list){
        List<Example> filteredList = new ArrayList<>();
        for (Example item : list){
            if(item.getDate().toString().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(item);
            }
        }
        if (filteredList.isEmpty() == true){
            Toast.makeText(this, "Item nya gak da cuy", Toast.LENGTH_SHORT).show();
        }else{
            AdapterCovid adapterCovid = new AdapterCovid(MainActivity.this,filteredList);
            recyclerView.setAdapter(adapterCovid);
            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        }
        }
}
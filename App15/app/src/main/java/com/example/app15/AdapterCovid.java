package com.example.app15;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterCovid extends RecyclerView.Adapter<AdapterCovid.ViewHolderCovid>{
    private Context context;
    private List<Example> list;



    public AdapterCovid(Context context, List<Example> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterCovid.ViewHolderCovid onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolderCovid(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCovid.ViewHolderCovid holder, int position) {
        holder.date.setText(list.get(position).getDate().toString());
        String date,states,positive,death,Total;
        date = list.get(position).getDate().toString();
        states = list.get(position).getStates().toString();
        positive = list.get(position).getPositive().toString();
        death = list.get(position).getDeath().toString();
        Total = list.get(position).getTotal().toString();
        String[] data = {list.get(position).getDate().toString(),list.get(position).getStates().toString(),list.get(position).getPositive().toString(),list.get(position).getDeath().toString(),list.get(position).getTotal().toString()};
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context ,DetailActivity.class);
                intent.putExtra("data", data);
                view.getContext().startActivity(intent);
            }
        });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
                DataCovid dataCovid = new DataCovid();
                dataCovid.date = date;
                dataCovid.states = states;
                dataCovid.positive = positive;
                dataCovid.death = death;
                dataCovid.total = Total;
                databaseHelper.dataCovidDao().insert(dataCovid);
                Toast.makeText(context, "Berhasil Di simpan ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }
    class ViewHolderCovid extends RecyclerView.ViewHolder{
        TextView date;
        Button button;
        public ViewHolderCovid(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            button = itemView.findViewById(R.id.download);
        }
    }
    public void filterlist(List<Example> filteredlist){
        this.list = filteredlist;
        notifyDataSetChanged();
    }
}
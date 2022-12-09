package com.example.app15;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDownload extends RecyclerView.Adapter<AdapterDownload.ViewHolderDownload> {
    private Context context;
    private List<DataCovid> list;

    public AdapterDownload(Context context, List<DataCovid> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterDownload.ViewHolderDownload onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_download,parent, false);
        return new ViewHolderDownload(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDownload.ViewHolderDownload holder, int position) {
        holder.date.setText(list.get(position).date);
        DataCovid datadel = list.get(position);
        String[] data = {list.get(position).date,list.get(position).states, list.get(position).positive, list.get(position).death,list.get(position).total};
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("data", data);
                view.getContext().startActivity(intent);
            }
        });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
                databaseHelper.dataCovidDao().delete(datadel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolderDownload extends RecyclerView.ViewHolder{
        TextView date;
        Button button;
        public ViewHolderDownload(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.datedownload);
            button = itemView.findViewById(R.id.Hapus);
        }
    }

}

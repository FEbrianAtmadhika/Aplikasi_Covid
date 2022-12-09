package com.example.app15;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DataCovid {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "states")
    public String states;

    @ColumnInfo(name = "positive")
    public String positive;

    @ColumnInfo(name = "death")
    public String death;

    @ColumnInfo(name = "total")
    public String total;

}

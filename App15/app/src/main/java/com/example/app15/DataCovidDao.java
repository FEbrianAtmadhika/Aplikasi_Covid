package com.example.app15;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DataCovidDao {
    @Query("SELECT *FROM datacovid")
    List<DataCovid> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DataCovid dataCovid);

    @Update
    void update(DataCovid dataCovid);

    @Delete
    void delete(DataCovid dataCovid);
}

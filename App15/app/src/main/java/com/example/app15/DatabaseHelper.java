package com.example.app15;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {DataCovid.class}, version = 1)
public abstract class DatabaseHelper extends RoomDatabase {
    public abstract DataCovidDao dataCovidDao();
    
    private static DatabaseHelper INSTANCE;
    private final MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
    @VisibleForTesting
    public static final String DATABASE_NAME = "listdata";
    private void setDatabaseCreated(){
        mutableLiveData.postValue(true);
    }
    private void updateDatabaseCreated(final Context context){
        if (context.getDatabasePath(DATABASE_NAME).exists()){
            setDatabaseCreated();
        }
    }
    public static DatabaseHelper buildDatabase(final Context context){
        return Room.databaseBuilder(context, DatabaseHelper.class, DATABASE_NAME).addCallback(new Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
                DatabaseHelper database = DatabaseHelper.getInstance(context);
                database.setDatabaseCreated();
            }
        }).allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    public static DatabaseHelper getInstance(final Context context) {
        if(INSTANCE == null){
            synchronized (DatabaseHelper.class){
                if (INSTANCE == null){
                    INSTANCE = buildDatabase(context);
                    INSTANCE.updateDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return INSTANCE;
    }
}

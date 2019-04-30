package com.example.smktelkom.membuatcrud;

import android.app.Application;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MyApp extends Application {
    public static  AppDatabase db;
  @Override
  public void onCreate(){
      super.onCreate();
      db = Room.databaseBuilder(getApplicationContext(),
              AppDatabase.class,"siswa.db").allowMainThreadQueries().build();

  }
}

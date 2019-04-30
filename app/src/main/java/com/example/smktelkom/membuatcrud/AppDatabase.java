package com.example.smktelkom.membuatcrud;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {SiswaModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SiswaDao userDao();
}

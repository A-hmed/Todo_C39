package com.route.todoc39.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.route.todoc39.database.dao.TodoDao
import com.route.todoc39.database.model.Todo

@Database(entities = [Todo::class], version = 1, exportSchema = true)
abstract class MyDatabase: RoomDatabase() {

    abstract fun todoDao(): TodoDao

    companion object{
        private const val DATABASE_NAME = "todo database";
        private var database: MyDatabase? = null

        fun getInstance(context: Context): MyDatabase{
            if(database == null){
                database = Room.databaseBuilder(context.applicationContext,
                    MyDatabase::class.java, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return database!!;
        }
    }
}
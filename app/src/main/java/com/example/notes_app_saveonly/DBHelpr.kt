package com.example.notes_app_saveonly

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelpr (context: Context):SQLiteOpenHelper(context,"Notes.db",null,1) {
    var sqLiteDatabase:SQLiteDatabase=writableDatabase
    override fun onCreate(db: SQLiteDatabase?) {

      if(db!=null)  {
          db.execSQL("create table notes(Notes text)")
      }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}
    fun savedat(notes :String){
        val cv=ContentValues()
        cv.put("Notes",notes)
        sqLiteDatabase.insert("Notes",null,cv)
    }
}
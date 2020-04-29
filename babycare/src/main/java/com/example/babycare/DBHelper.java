package com.example.babycare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, "TWay.db", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CreateSQL = "CREATE TABLE IF NOT EXISTS BABYCARE (" +
                "IDX "           + "INTEGER NOT NULL," +
                "M_DATE "         + "TEXT," +
                "S_DATE "        + "TEXT," +
                "M_MEMO "         + "TEXT," +
                "S_MEMO "        + "TEXT," +
                "M_SIZE "         + "TEXT," +
                "S_SIZE "        + "TEXT," +
                "BABY_NUM "        + "INTEGER," +
                "CONSTRAINT baby_PK PRIMARY KEY (IDX),"+
                "CONSTRAINT baby_FK FOREIGN KEY (BABY_NUM) REFERENCES babyinfo(baby_num)"
                + ")";
        db.execSQL(CreateSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion != DATABASE_VERSION){
            db.execSQL("drop table BABYCARE");
            onCreate(db);
        }
    }
}



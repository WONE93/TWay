package com.example.babycare;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class CareDAO {
    DBHelper dbhelper = null;


    //목록조회
    public ArrayList<HashMap<String, String>> selectAll(Context context){

        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        dbhelper = new DBHelper(context);
        SQLiteDatabase db=dbhelper.getReadableDatabase(); //데이터베이스 연결
        String sql = "select _no, name, PHONE, OVER20 from CONTACT_T order by _no ";
        Cursor cursor=db.rawQuery(sql, null); // sql구문 실행
        while (cursor.moveToNext()){                      // 결과(Resultset)를 list에 담기
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("_no", cursor.getString(0));
            map.put("name", cursor.getString(1));
            map.put("PHONE", cursor.getString(2));
            map.put("OVER20", cursor.getString(3));
            list.add(map);
        }
        dbhelper.close();           // DB연결 해제
        return list;
    }


    //등록
    public void insert(Context context, CareVO vo){
        dbhelper = new DBHelper(context);
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        String sqlInsert = "INSERT INTO CONTACT_T " +
                "(_NO, NAME, PHONE, OVER20) VALUES (" +
                vo.get_no() +","+
                "'" + vo.getName() + "'," +
                "'" + vo.getPhone() + "'," +
                vo.getOver20() +")";
        db.execSQL(sqlInsert);
        dbhelper.close();

    }

    //인서트 두개
    //샐랙트원 두개
    //기록

}

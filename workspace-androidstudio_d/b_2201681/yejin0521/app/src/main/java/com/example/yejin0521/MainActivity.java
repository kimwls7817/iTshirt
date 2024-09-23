package com.example.yejin0521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    myDBHelper myHelper;
    Button btnInit, btnInsert, btnSelect, btnUpdate, btnDelete;
    EditText edtName, edtNumber, edtNameResult, edtNumberResult;
    SQLiteDatabase sqlDB; //SQL문 사용(insert, delete, select, update)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("가수 그룹 관리 DB");

        myHelper = new myDBHelper(this);

        btnInit = findViewById(R.id.btnInit);
        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);

        edtName = findViewById(R.id.edtName);
        edtNumber = findViewById(R.id.edtNumber);
        edtNameResult = findViewById(R.id.edtNameResult);
        edtNumberResult = findViewById(R.id.edtNumberResult);

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase(); //DB에 쓰기
                myHelper.onUpgrade(sqlDB,1,2)5
                sqlDB.close();

            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("insert into groupTbl values('"+edtName.getText().toString()+"',"+edtNumber.getText().toString()+");");
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "입력됨", Toast.LENGTH_LONG).show();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("select * from groupTbl;", null);

                String sname = "그룹 이름" + "\r\n "+"_______________"+"\r\n";
                String snumber = "그룹 인원" + "\r\n "+"_______________"+"\r\n";
                while(cursor.moveToNext())
                {
                    sname += cursor.getString(0)+"\r\n";
                    snumber += cursor.getString(1)+"\r\n";
                }
                edtNameResult.setText(sname);
                edtNumberResult.setText(snumber);
                cursor.close();
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "조회됨", Toast.LENGTH_LONG).show();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                if (edtName.getText().toString() != "")
                {
                    sqlDB.execSQL("UPDATE groupTbl SET gNumber ="+ edtNumber.getText() + " WHERE gName ='"+ edtName.getText().toString() + "';");
                }
                sqlDB.close();
                btnSelect.callOnClick();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                if (edtName.getText().toString() != "")
                {
                    sqlDB.execSQL("DELETE FROM groupTbl WHERE gName = '"+ edtName.getText().toString() + "';");
                }
                sqlDB.close();
                btnSelect.callOnClick();
            }
        });
    }

    class myDBHelper extends SQLiteOpenHelper{
        //생성자, onCreate, inUpgrade()

        public myDBHelper(Context context){
            super(context, "groupDB", null, 1); //데이터베이스 이름
        }


        @Override
        public void onCreate(SQLiteDatabase db) { //테이블 생성
            db.execSQL("create table groupTbl(gname char(20) primary key, gnumber integer);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            //초기화
            db.execSQL("drop table if exists groupTbl");
            onCreate(db);
        }
    }
}
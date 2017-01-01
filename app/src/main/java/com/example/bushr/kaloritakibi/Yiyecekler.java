package com.example.bushr.kaloritakibi;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Yiyecekler extends AppCompatActivity {
    Button btn7;
    SQLiteDatabase db =null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecekler);
        db=openOrCreateDatabase("KaloriHesapla" ,MODE_PRIVATE,null);
        String createQuery="Create table if not exists Yiyecek(_id integer primary key autoincrement,foodname text,fooddate text,foodcal integer);";
        db.execSQL(createQuery);

        btn7=(Button)findViewById(R.id.button6);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(Yiyecekler.this,MainActivity.class);
                startActivity(i5);
            }
        });
    }









    public void AddFood(String foodtype) {
        db=openOrCreateDatabase("KaloriHesapla" ,MODE_PRIVATE,null);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat myDateFormat=new SimpleDateFormat("yyyy-MM-dd  HH:mm");
        String fooddate= myDateFormat.format(c.getTime());
        String insertQuery="insert into Food(foodname,fooddate,foodcal) values ('";
        insertQuery +=foodtype + ","+ fooddate + ","+ foodcal +")";
        db.execSQL(insertQuery);
    }




    public void TavukClick(View view) {
        String txtTavuk="Kızarmış tavuk ";
AddFood(txtTavuk);

        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }

    public void EkmekClick(View view) {
        String txtEkmek="Tam Buğday EKmeği";
AddFood(txtEkmek);

        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }
    public void PatatesClick(View view) {
        String txtPatates="Patates Kızartması ";
AddFood(txtPatates);

        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }




}

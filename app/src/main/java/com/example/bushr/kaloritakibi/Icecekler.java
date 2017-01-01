package com.example.bushr.kaloritakibi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Icecekler extends AppCompatActivity {
    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecekler);
        btn6=(Button)findViewById(R.id.button5);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(Icecekler.this,MainActivity.class);
                startActivity(i4);
            }
        });


    }


    public void ColaClick(View view) {
        String txtCola="Kızarmış tavuk ";


        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }

    public void AyrnClick(View view) {
        String txtAyrn="Tam Buğday EKmeği";


        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }
    public void MeyvesuClick(View view) {
        String txtMeyvesu="Patates Kızartması ";


        Toast.makeText(this,"Günlük Kalori Listesine Eklendi", Toast.LENGTH_SHORT).show();


    }
}

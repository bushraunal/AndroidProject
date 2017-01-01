package com.example.bushr.kaloritakibi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YiyecekEkle extends AppCompatActivity {
    Button btnx;
    Button btny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecek_ekle);
btny=(Button) findViewById(R.id.button4);
        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(YiyecekEkle.this,Icecekler.class);
                startActivity(i3);
            }
        });
        btnx=(Button)findViewById(R.id.button3);
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(YiyecekEkle.this,Yiyecekler.class);
                startActivity(i2);
            }
        });
    }
}

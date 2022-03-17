package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4,card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card1=(CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card2);
        card3=(CardView) findViewById(R.id.card3);
        card4=(CardView) findViewById(R.id.card4);
        card5=(CardView) findViewById(R.id.card5);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,MainCard1.class);
        switch (v.getId()){
            case R.id.card1: i.putExtra("ID","college");startActivity(i);break;
            case R.id.card2: i.putExtra("ID","id2");startActivity(i);break;
            case R.id.card3: i.putExtra("ID","id3");startActivity(i);break;
            case R.id.card4: i.putExtra("ID","id4");startActivity(i);break;
            case R.id.card5: i.putExtra("ID","id5");startActivity(i);break;
            default: break;
        }
    }
}
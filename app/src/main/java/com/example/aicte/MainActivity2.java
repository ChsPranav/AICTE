package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card1=(CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card2);
//        card3=(CardView) findViewById(R.id.card3);
//        card4=(CardView) findViewById(R.id.card4);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
//        card3.setOnClickListener(this);
//        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.card1: i=new Intent(this,MainCard1.class);startActivity(i);break;
            case R.id.card2: i=new Intent(this,MainCard2.class);startActivity(i);break;
//            case R.id.card3: i=new Intent(this,MainCard3.class);startActivity(i);break;
//            case R.id.card4: i=new Intent(this,MainActivity4.class);startActivity(i);break;
            default: break;
        }
    }
}
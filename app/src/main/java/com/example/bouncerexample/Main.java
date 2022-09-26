package com.example.bouncerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

    static int YellowSpeed = 1, myBallSpeed = 10, magentaBallSpeed = 16, redballSpeed = 5, greenBallSpeed = -20, valueClick = 0;
    TextView status;
    Button normal, fast, slow;
    String stats = "";
    AnimationView animationView;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = (AnimationView)findViewById(R.id.animationView);
        restart = findViewById(R.id.restart);
        fast= findViewById(R.id.fast);
        slow= findViewById(R.id.slow);
        normal= findViewById(R.id.normal);

//        status= findViewById(R.id.status);

        fast();
        slow();
        normal();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Main.class);
                startActivity(intent);
            }
        });


    } //End onCreate

    private void normal() {
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueClick = 0;
                YellowSpeed = 1;
                myBallSpeed = 10;
                magentaBallSpeed = 16;
                redballSpeed = 5;
                greenBallSpeed = -20;
                Toast.makeText(Main.this, "Normal speed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void fast() {
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueClick += 10;
                 YellowSpeed += 10;
                myBallSpeed += 10;
                magentaBallSpeed += 10;
                redballSpeed += 10;
                greenBallSpeed += 10;
                Toast.makeText(Main.this, String.valueOf(valueClick) + " speed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void slow() {
        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueClick -= 10;
                YellowSpeed -= 10;
                myBallSpeed -= 10;
                magentaBallSpeed -= 10;
                redballSpeed -= 10;
                greenBallSpeed -= 10;
                Toast.makeText(Main.this, String.valueOf(valueClick) + " speed", Toast.LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

} //end class Main
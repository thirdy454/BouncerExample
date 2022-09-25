package com.example.bouncerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    int YellowSpeed = 1;
    TextView status;
    Button yellow, magenta, red, green, blue, fast, slow;
    String stats = "";
    AnimationView animationView;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = (AnimationView)findViewById(R.id.animationView);
        restart = findViewById(R.id.restart);
        yellow= findViewById(R.id.yellow);
        magenta= findViewById(R.id.magenta);
        red= findViewById(R.id.red);
        green= findViewById(R.id.green);
        blue= findViewById(R.id.blue);
        fast= findViewById(R.id.fast);
        slow= findViewById(R.id.slow);
        status= findViewById(R.id.status);

        fast();
        slow();
        color();
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Main.class);
                startActivity(intent);


            }
        });


    } //End onCreate

    private void fast() {
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    private void slow() {
        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void color() {
        //yellow
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("yellow");
                stats = "yellow";
            }
        });

        //magenta
        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("magenta");
                stats = "magenta";
            }
        });


        //red
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("red");
                stats = "red";
            }
        });

        //green
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("green");
                stats = "green";
            }
        });

        //blue
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setText("blue");
                stats = "blue";
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
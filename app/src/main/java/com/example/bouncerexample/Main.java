package com.example.bouncerexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
//import android.view.menu;
import android.os.Bundle;
import android.view.Menu;

public class Main extends Activity {

    AnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = (AnimationView)findViewById(R.id.animationView);
    } //End onCreate

    @Override
    public boolean onCreateOptionMenu(Menu menu){
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }
} //end class Main
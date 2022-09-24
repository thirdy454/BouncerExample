package com.example.bouncerexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.logging.Handler;

public class AnimationView extends View {
    private final int FRAME_RATE = 15;         //rate for animation
    private Paint paint;    //paint object - for setting graphic colors
    private Handler h;      //Handler for animation timing
    Ball myBall;            //Objects in animation

    public AnimationView(Context context, AttributeSet attrs){
        super(context, attrs);
        // TODO Auto-generated constructor stub
//        comment ko muna baba nag error e
//        h = new Handler();  //set the handler object
        paint = new Paint();
        paint.setColor(Color.BLUE);
        myBall = new Ball(100, 100, Color.BLUE,50);
        myBall.setDx(30);
        myBall.setDy(30);

    }//end ng constructor

    protected void onDraw(Canvas c) {
        myBall.bounce(c); //myBall move and bounce off walls - model

        //Draw the images taking data from balls
        c.drawCircle(myBall.getX(), myBall.getY(), myBall.getRadius(), myBall.getPaint());
//        h.postDelayed(r, FRAME_RATE);  comment ko muna error e
    }//end ng onDraw
    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate(); //calls the onDraw in view Objects
        }
    };//end ng RUnnable r
}//end ng class

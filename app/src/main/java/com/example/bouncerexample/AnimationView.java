package com.example.bouncerexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;


public class AnimationView extends View {
    private final int FRAME_RATE = 15;         //rate for animation
    private Paint paint;    //paint object - for setting graphic colors
    private Handler h;      //Handler for animation timing
    Ball myBall;            //Objects in animation
    Ball greenBall;
    Ball redball;

    public AnimationView(Context context, AttributeSet attrs){
        super(context, attrs);
        // TODO Auto-generated constructor stub
//        comment ko muna baba nag error e
        h = new Handler();  //set the handler object

        //Paint Object
        paint = new Paint();
        paint.setColor(Color.BLUE);

        //Create Ball Objects
        myBall = new Ball(100, 100, Color.BLUE,50);
        myBall.setDx(30);
        myBall.setDy(30);
        greenBall = new Ball(200, 200, Color.GREEN, 25);
        redball = new Ball(50, 400, Color.RED, 75);

        //Set Speed of myBall
        myBall.setDx(10);
        myBall.setDy(10);

        //Set Speed of greenBall and redBall
        greenBall.setDx(-20);
        greenBall.setDy(-15);
        redball.setDx(5);
        redball.setDy(-5);
    }//end ng constructor

    protected void onDraw(Canvas c) {
        //Calculate the model
        myBall.bounce(c); //myBall move and bounce off walls - model
        greenBall.bounce(c); //greenBall Bounce
        redball.bounce(c); // redBall Bounce

        //Draw the images taking data from balls
        c.drawCircle(myBall.getX(), myBall.getY(), myBall.getRadius(), myBall.getPaint());
        c.drawCircle(greenBall.getX(), greenBall.getY(), greenBall.getRadius(), greenBall.getPaint());
        c.drawCircle(redball.getX(), redball.getY(), redball.getRadius(), redball.getPaint());
        h.postDelayed(r, FRAME_RATE);

        //Call the Runnable to re calculate the model and
        //Draw the Animation
        h.postDelayed(r, FRAME_RATE);

    }//end ng onDraw
    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate(); //calls the onDraw in view Objects
        }
    };//end ng RUnnable r
}//end ng class

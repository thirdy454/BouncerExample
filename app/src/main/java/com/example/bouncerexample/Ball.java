package com.example.bouncerexample;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Ball {

    private Point p; // Structure storing Point of Ball
    private int c; // integer for color
    private int r; // integer for radius
    private int dx; // integer for change in x position
    private int dy; // integer for change in y position
    private Paint paint; // Holds color for drawing on canvas

    public Ball(int x, int y, int col, int radius) {
        p = new Point(x, y); // set x and y position
        c = col; // set the color integer
        r = radius; // sets the size
        paint = new Paint(); //creates paint object
        paint.setColor(c); // sets color for paint object
        //for an experiment
       dx = 0;
       dy = 0;
    } // End Constructor for Ball

    public int getX() {
        return p.x;
    }

    public int getY() {
        return p.y;
    }

    public int getRadius() {
        return r;
    }

    public Paint getPaint() {
        return paint;
    }

    //Setters
    public void setColor(int color) {
        this.c = color;
    }

    public void goTo(int x, int y) {
        p.x = x;
        p.y = y;
    }

    public void setDx(int speed) {
        this.dx = speed;
    }

    public void setDy(int speed) {
        this.dy = speed;
    }

    //Function for moving and bouncing
    public void move() {
        p.x = p.x + dx;
        p.y = p.y + dy;
    }

    // Bounce off Edge
    public void bounce(Canvas canvas){
        move();
        if (p.x > canvas.getWidth() || p.x < 0){
            dx = dx * -1;
        }
        if (p.y > canvas.getHeight() || p.y < 0){
            dy = dy * -1;
        }
    } // end bounce()

    // Collision Detection with other Ball Object
    public void bounceOff(Ball b){
        if ((Math.abs(b.getX()-p.x) < b.getRadius() + r) && (Math.abs(b.getY()- p.y) < b.getRadius() + r)) {
            dx = dx * -1;
            dy = dy * -1;
        }
    }// end bounce off

} // end Class Ball

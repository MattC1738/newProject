import java.awt.*;
import javax.swing.*;
import java.math.*;
public class Ball{
    private int x = 0;
    private int y = 0;
    private int xSpeed;
    private int ySpeed;
    private int size;
    private int R;
    private int G;
    private int B;
    Ball(int x, int y, int xSpeed, int ySpeed,int size, int R, int G, int B){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.size = size;
        this.R = R;
        this.G = G;
        this.B = B;
    }

    Ball(){
        x = xSpeed;
        y = ySpeed;
        xSpeed = 5;
        ySpeed = 5;
        size = 20;
        R = 0;
        G = 0;
        B = 0;
    }

    public void drawBall(Graphics G){
        G.fillOval(x,y,size,size);
    }

    public void changeSpeed(int newSpeed){
        xSpeed = newSpeed;
        ySpeed = newSpeed;
    }

    public void changeColor(){
        R = (int)(Math.random()*200)+50;
        G = (int)(Math.random()*200)+50;
        B = (int)(Math.random()*200)+50;

    }

    public void moveRight(){
        x += xSpeed;
    }

    public void moveLeft(){
        x -= xSpeed;
    }

    public void moveUp(){
        y += ySpeed;
    }

    public void moveDown(){
        y -= ySpeed;
    }

    public int getR(){return R;}
    public int getG(){return G;}
    public int getB(){return B;}
}
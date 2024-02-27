import javax.swing.*;
import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int speedx;
    private int speedy;
    private int xx = (int)(Math.random()*480)+1;
    private int yy = (int)(Math.random()*480)+1;
    private int sp = (int)(Math.random()*20)+1;

    private ImageIcon ed = new ImageIcon("Images/Ed-Sheeran-PNG.png");

    public Ball(int x, int y){
        this.x = xx;
        this.y = yy;
        speedx = sp;
        speedy = sp;
    }

    public void draw(Graphics g2){
        g2.drawImage(ed.getImage(), x, y, 300,60, null);
    }

    public int getX(){
        return xx;
    }
    public int getY(){
        return yy;
    }


    public void move(int w, int l){
        xx += speedx;
        yy += speedy;
        if(xx>= w||xx<=0){
            speedx=speedx*-1;
        }
        if(yy>=l||yy<=0){
            speedy=speedy*-1;
        }

    }




}

import javax.swing.*;
import java.awt.*;

public class Ball {

    private int speedx;
    private int speedy;
    private int speedxog;
    private int speedyog;
    private int xx = (int)(Math.random()*480)+1;
    private int yy = (int)(Math.random()*480)+1;
    private int sp = (int)(Math.random()*30)+10;
    private int count = 0;
   // private int count2 = 0;

    private ImageIcon ed = new ImageIcon("Images/Ed-Sheeran-PNG.png");
    private ImageIcon evilEd = new ImageIcon("Images/Evil-Ed.png");

    public Ball(){
        speedx = 5;
        speedy = 5;
    }

    public void draw(Graphics g2){
        g2.drawImage(ed.getImage(), xx, yy, 300,60, null);
    }

    public void drawEvil(Graphics g2){
        g2.drawImage(evilEd.getImage(), xx, yy, 300, 60, null);
    }

public int getX(){
        return xx;
}
    public int getY(){
        return yy;
    }

    public void hardMode(){
        speedx = 10;
        speedy = 10;
        count = 1;
    }

    public void easyMode(){
        speedx = 1;
        speedy = 1;
        count = 2;
    }

    public void regMode(){
        speedx = 5;
        speedy = 5;
        count = 0;
    }

    public void stop(){
        speedxog = speedx;
        speedyog = speedy;
        if (speedy != 0 && speedx != 0){
            speedx = 0;
            speedy = 0;
        }
        else{
            if (count == 1){
                speedx = 10;
                speedy = 10;
            }
            else if (count == 2){
                speedx = 1;
                speedy = 1;
            }
            else{
                speedy = 5;
                speedx = 5;
            }
        }
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

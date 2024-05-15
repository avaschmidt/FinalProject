import javax.swing.*;
import java.awt.*;
public class Party {


    private int speedx;
    private int speedy;
    private int xx = (int)(Math.random()*480)+1;
    private int yy = (int)(Math.random()*480)+1;
    private int count = 0;
    private int height = 60;
    private int width = 300;
    
    private ImageIcon partyEd = new ImageIcon("Images/Ed-Party.png");

    public Party(){
         speedx = 30;
         speedy = 30;
    }

    public void draw(Graphics g2){
        g2.drawImage(partyEd.getImage(), xx, yy, width,height, null);
    }
        public void setSizeSmall(){
        width = 0;
        height = 0;
    }

    public void setSizeReg(){
        width = 300;
        height = 60;
    }


    public int getX(){
        return xx;
    }
    public int getY(){
        return yy;
    }

    public void stop(){
        if (speedy != 0 && speedx != 0){
            speedx = 0;
            speedy = 0;
        }
        else{
           speedx = 30;
           speedy = 30;
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

    public void partyTime(){
        speedx = 30;
        speedy = 30;
        setSizeReg();

    }



}

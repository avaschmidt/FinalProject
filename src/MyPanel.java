import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
    int xLoc = (int)(Math.random()*480)+1;
    int yLoc = (int)(Math.random()*480)+1;
    int xVel = 5;
    int yVel = 5;

    public static Ball edsheeran;
    public static Evil evilEd;
   // static Ball[] balls = new Ball[200];

    public MyPanel(){

        evilEd = new Evil();
        evilEd.setSizeSmall();
        //evilEd.start();
       // evilEd.setFocusable(false);
       setBackground(Color.GREEN);
       setPreferredSize(new Dimension(500,500));
        edsheeran = new Ball();
        setFocusable(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
               // if((edsheeran.getX() <= e.getX()+100 && edsheeran.getX() >= e.getX()-100) && (edsheeran.getY() <= e.getY()+100 && edsheeran.getY() >= e.getY()-100)){
                    edsheeran.stop();
                    evilEd.stop();
               // }

            }
        });





    }

//    public static void click(){
//        for (int i = 0; i<balls.length;i++){
//            balls[i] = new Ball();
//        }
//
//    }

//    public static void evilMode(){
//        //evilEd.setFocusable(true);
//
//    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      //  System.out.println("Hi");


       edsheeran.draw(g);
       edsheeran.move(getWidth()-30,getHeight()-30);
       evilEd.draw(g);
       evilEd.move(getWidth()-30,getHeight()-30);
       // evilEd.drawEvil();
    //evilEd.move(getWidth()-20,getHeight()-20);



       //delay the time
       try {
           Thread.sleep(100);
       }
       catch(InterruptedException e){
           System.out.println(e);
       };


       repaint();
    }


}

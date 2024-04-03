import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel {
    int xLoc = (int)(Math.random()*480)+1;
    int yLoc = (int)(Math.random()*480)+1;
    int xVel = 5;
    int yVel = 5;

    Ball edsheeran;
    static Ball[] balls = new Ball[200];

    public MyPanel(){
       setBackground(Color.GREEN);
       setPreferredSize(new Dimension(500,500));
        edsheeran = new Ball();
        setFocusable(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
                if((edsheeran.getX() <= e.getX()+20 && edsheeran.getX() >= e.getX()-20) && (edsheeran.getY() <= e.getY()+20 && edsheeran.getY() >= e.getY()-20)){
                    edsheeran.stop();
                }

            }
        });



    }

    public static void click(){
        for (int i = 0; i<balls.length;i++){
            balls[i] = new Ball();
        }

    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      //  System.out.println("Hi");


       edsheeran.draw(g);
       edsheeran.move(getWidth()-20,getHeight()-20);



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

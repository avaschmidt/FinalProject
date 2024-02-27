import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    int xLoc = (int)(Math.random()*480)+1;
    int yLoc = (int)(Math.random()*480)+1;
    int xVel = 5;
    int yVel = 5;

    Ball edsheeran;


    public MyPanel(){
       setBackground(Color.GREEN);
       setPreferredSize(new Dimension(500,500));
        edsheeran = new Ball(200,200);

    }



   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("Hi");

//       for (int i = 0; i<balls.length;i++){
//           edsheeran.draw(g);
//           edsheeran.move(getWidth()-20,getHeight()-20);
//
//       }

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

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        JPanel panel = new JPanel();
       panel.setBackground(new Color(255, 203, 236));
        panel.setLayout(new BorderLayout());

   //ImageIcon ed = new ImageIcon("Images/Ed-Sheeran-PNG.png");

        //ed.setImage(ed.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT));


       //JLabel picLabel = new JLabel(ed);




    //   panel.add(picLabel);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
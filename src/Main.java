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

        MyPanel panel = new MyPanel();
       panel.setBackground(new Color(255, 203, 236));
        panel.setLayout(new BorderLayout());

        MyPanel panel2 = new MyPanel();
        panel2.setBackground(new Color(255, 203, 236));
        panel2.setLayout(new BorderLayout());

        JLabel title = new JLabel("Welcome to Ed Shee-run!");
//       JButton party = new JButton("Party Time!");
        JButton slow = new JButton("Slow");
       // JButton medium = new JButton("Medium");
        JButton hard = new JButton("Fast");
        

        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // Ball.hardMode();
                System.out.println("FAST!");
                MyPanel.edsheeran.hardMode();
            }
        });

        slow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ball.hardMode();
                System.out.println("SLOW!");
                MyPanel.edsheeran.easyMode();
            }
        });

//
//  ImageIcon ed = new ImageIcon("Images/Ed-Sheeran-PNG.png");
//
//        ed.setImage(ed.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT));
//
//
//       JLabel picLabel = new JLabel(ed);
//
//
//
//          panel.add(picLabel);

//        party.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//
//            }
//        });

        panel2.add(title, BorderLayout.CENTER);
//        panel.add(party, BorderLayout.SOUTH);
         panel2.add(slow, BorderLayout.NORTH);
//        panel2.add(medium, BorderLayout.);
        panel2.add(hard, BorderLayout.SOUTH);

        frame.add(panel);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);

    }
}
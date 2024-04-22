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

        JLabel title = new JLabel("Welcome to Ed Sheer-tag!");
//       JButton party = new JButton("Party Time!");
        //JButton easy = new JButton("Easy");
       // JButton medium = new JButton("Medium");
        JButton hard = new JButton("Hard");


        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // Ball.hardMode();
                System.out.println("PRESSED!");
                MyPanel.edsheeran.hardMode();
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

        panel.add(title, BorderLayout.NORTH);
//        panel.add(party, BorderLayout.SOUTH);
//        panel.add(easy, BorderLayout.);
//        panel.add(medium, BorderLayout.);
        panel.add(hard, BorderLayout.SOUTH);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
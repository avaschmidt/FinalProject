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
        frame.setLayout(new BorderLayout());

        MyPanel panel = new MyPanel();
       panel.setBackground(new Color(255, 203, 236));

        panel.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(234, 224, 224));
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(234, 224, 224));
        panel3.setLayout(new BorderLayout());

        JLabel title = new JLabel("Welcome to Ed Shee-run!");
//       JButton party = new JButton("Party Time!");
        JButton slow = new JButton("Slow");
        JButton medium = new JButton("Regular");
        JButton hard = new JButton("Fast");
        JButton evil = new JButton("Do Not Push!");
        

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

        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ball.hardMode();
                System.out.println("RESET!");
                MyPanel.edsheeran.regMode();
            }
        });

        evil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ball.hardMode();
                System.out.println("RESET!");
                MyPanel.edsheeran.evil();
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
         panel2.add(slow, BorderLayout.NORTH);
        panel2.add(medium, BorderLayout.CENTER);
        panel2.add(hard, BorderLayout.SOUTH);
        panel3.add(evil, BorderLayout.NORTH);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }
}
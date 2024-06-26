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
        JButton slow = new JButton("Slow");
        JButton medium = new JButton("Regular");
        JButton hard = new JButton("Fast");
        JButton evil = new JButton("Do Not Push!");
        JButton party = new JButton("Party Time!");
        JButton reset = new JButton("Reset");
        

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

                System.out.println("SLOW!");
                MyPanel.edsheeran.easyMode();
            }
        });

        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("REG!");
                MyPanel.edsheeran.regMode();
            }
        });

        evil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("EVIL ACTIVATE!");
                MyPanel.evilEd.evilMode();
                panel.setBackground(new Color(248, 37, 37));
               // MyPanel.edsheeran.evil();

            }
        });

        party.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("PARTY TIME!");
                for(int i = 0; i<200; i++){MyPanel.eds[i].partyTime();}
                panel.setBackground(new Color(0, 255, 160));
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("RESET");
                for(int i = 0; i<200; i++){MyPanel.eds[i].setSizeSmall();}
                MyPanel.evilEd.setSizeSmall();
                panel.setBackground(new Color(255, 203, 236));
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
         panel2.add(slow, BorderLayout.NORTH);
        panel2.add(medium, BorderLayout.CENTER);
        panel2.add(hard, BorderLayout.SOUTH);
        panel3.add(evil, BorderLayout.NORTH);
        panel3.add(party, BorderLayout.CENTER);
        panel3.add(reset, BorderLayout.SOUTH);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }
}
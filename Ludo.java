import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Ludo {
    
public static void main(String[] args){

//An instance of a JFrame
JFrame frame = new JFrame();
frame.setTitle("RANDOM NUMBER GENERATOR");
frame.setForeground(new Color(0x000000));
frame.setFont(new Font("Arial", Font.BOLD, 30));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.setSize(600,500);
frame.setLayout(null);


// Changing JFrame's ImageIcon
ImageIcon image = new ImageIcon("chinese-checkers.png");
frame.setIconImage(image.getImage());
frame.getContentPane().setBackground(new Color(0x162454));




JButton btn = new JButton("GUESS NUMBER");
btn.setBackground(new Color(0x1f87fc));
btn.setForeground(Color.WHITE);
btn.setFont(new Font("Arial", Font.BOLD, 12));
btn.setBounds(180, 100, 150,35);

btn.setFocusPainted(false);    
btn.setBorderPainted(false);
frame.add(btn);

 final TextField t1 = new TextField();
    t1.setBounds(219,160,60,35);
    t1.setBackground(new Color(0xe0f2f1));
    t1.setForeground(new Color(0xffffff));
    t1.setEditable(false);
    frame.add(t1);


frame.setVisible(true);

}


}

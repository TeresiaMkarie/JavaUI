import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Loans{

    public static void main(String[] args){

Border  border = BorderFactory.createLineBorder(Color.BLACK,1);





 //First textField input
    JTextField t1 = new JTextField();
    t1.setBounds(85,30,60,35);
    t1.setBackground(Color.WHITE);
    t1.setOpaque(true);
    t1.setForeground(new Color(0x1f87fc));
    t1.setBorder(border);
  
    //First label input
    JLabel label = new JLabel();
    label.setText("NAME: ");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.CENTER);
    label.setForeground(new Color(0x1f87fc));
    label.setFont(new Font("Arial", Font.PLAIN, 10));
    label.setBackground(Color.WHITE);
    label.setOpaque(true);
    label.setBorder(border);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(20, 30, 60, 35);

   //second textfield Input
   JTextField t2 = new JTextField();
    t2.setBounds(85,80,60,35);
    t2.setBackground(Color.WHITE);
    t2.setOpaque(true);
    t2.setForeground(new Color(0x1f87fc));
    t2.setBorder(border);

    //Second label input
    JLabel label2 = new JLabel();
    label2.setText("DEPOSIT: ");
    label2.setHorizontalTextPosition(JLabel.CENTER);
    label2.setVerticalTextPosition(JLabel.CENTER);
    label2.setForeground(new Color(0x1f87fc));
    label2.setFont(new Font("Arial", Font.PLAIN, 10));
    label2.setBackground(Color.WHITE);
    label2.setOpaque(true);
    label2.setBorder(border);
    label2.setHorizontalAlignment(JLabel.CENTER);
    label2.setBounds(20, 80, 60, 35);

    //Third textfield Input
    JTextField t3 = new JTextField();
    t3.setBounds(85,130,60,35);
    t3.setBackground(Color.WHITE);
    t3.setOpaque(true);
    t3.setForeground(new Color(0x1f87fc));
    t3.setBorder(border);
  
    
    //Third label input
    JLabel label3 = new JLabel();
    label3.setText("MONTHS: ");
    label3.setHorizontalTextPosition(JLabel.CENTER);
    label3.setVerticalTextPosition(JLabel.CENTER);
    label3.setForeground(new Color(0x1f87fc));
    label3.setFont(new Font("Arial", Font.PLAIN, 10));
    label3.setBackground(Color.WHITE);
    label3.setOpaque(true);
    label3.setBorder(border);
    label3.setHorizontalAlignment(JLabel.CENTER);
    label3.setBounds(20, 130, 60, 35);

  




   //Create a JFrame instance
   JFrame frame = new JFrame();
   frame.setTitle("Loans Detector");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Exiting out of the application
   frame.setResizable(false);
   frame.setSize(700,700);
   frame.setVisible(true);

   //creating an ImageIcon
   ImageIcon image = new ImageIcon("NFT.png");
   frame.setIconImage(image.getImage());
   frame.getContentPane().setBackground(new Color(0x1f004f));
   frame.add(label);
   frame.add(t1);
   frame.add(t2);
  frame.add(label2);
  frame.add(t3);
  frame.add(label3);
  
    }


    }

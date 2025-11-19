
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loans{

    public static void main(String[] args){

Border  border = BorderFactory.createLineBorder(Color.WHITE,1);



 //First textField input
    JTextField t1 = new JTextField();
    t1.setBounds(88,30,140,35);
    t1.setBackground(new Color(0x162454));
    t1.setOpaque(true);
    t1.setForeground(new Color(0xffffff));
    t1.setBorder(border);

  
    //First label input
    JLabel label = new JLabel();
    label.setText("NAME     : ");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.CENTER);
    label.setForeground(new Color(0xffffff));
    label.setFont(new Font("Arial", Font.BOLD, 10));
    label.setBackground(new Color(0x162454));
    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(20, 30, 60, 35);

   //second textfield Input
    final TextField t2 = new TextField();
    t2.setBounds(88,80,140,35);
    t2.setBackground(new Color(0x162454));
    t2.setForeground(new Color(0Xffffff));


    //Second label input
    JLabel label2 = new JLabel();
    label2.setText("DEPOSIT : ");
    label2.setHorizontalTextPosition(JLabel.CENTER);
    label2.setVerticalTextPosition(JLabel.CENTER);
    label2.setForeground(new Color(0xffffff));
    label2.setFont(new Font("Arial", Font.BOLD, 10));
    label2.setBackground(new Color(0x162454));
    label2.setOpaque(true);
    label2.setHorizontalAlignment(JLabel.CENTER);
    label2.setBounds(20, 80, 60, 35);

    //Third textfield Input
    final TextField t3 = new TextField();
    t3.setBounds(88,130,60,35);
    t3.setBackground(new Color(0x162454));
    t3.setForeground(new Color(0xffffff));

  
    
    //Third label input
    JLabel label3 = new JLabel();
    label3.setText("MONTHS : ");
    label3.setHorizontalTextPosition(JLabel.CENTER);
    label3.setVerticalTextPosition(JLabel.CENTER);
    label3.setForeground(new Color(0xffffff));
    label3.setFont(new Font("Arial", Font.BOLD, 10));
    label3.setBackground(new Color(0x162454));
    label3.setOpaque(true);
    label3.setHorizontalAlignment(JLabel.CENTER);
    label3.setBounds(20, 130, 60, 35);

     //fourth textfield Input
    final TextField t4 = new TextField();
    t4.setBounds(88,180,60,35);
    t4.setBackground(new Color(0x162454));
    t4.setForeground(new Color(0xffffff));
   
  
    
    //Fourth label input
    JLabel label4 = new JLabel();
    label4.setText("RATE : ");
    label4.setHorizontalTextPosition(JLabel.CENTER);
    label4.setVerticalTextPosition(JLabel.CENTER);
    label4.setForeground(new Color(0xffffff));
    label4.setFont(new Font("Arial", Font.BOLD, 10));
    label4.setBackground(new Color(0x162454));
    label4.setOpaque(true);
    label4.setHorizontalAlignment(JLabel.CENTER);
    label4.setBounds(20, 180, 60, 35);

  //fifth textfield Input
    final TextField t5 = new TextField();
    t5.setBounds(88,230,140,35);
    t5.setBackground(new Color(0x162454));
    t5.setForeground(new Color(0xffffff));
    t5.setEditable(false);

  
     
  
    //fifth  label input
    JLabel label5 = new JLabel();
    label5.setText("TOTAL.LOAN: ");
    label5.setHorizontalTextPosition(JLabel.CENTER);
    label5.setVerticalTextPosition(JLabel.CENTER);
    label5.setForeground(new Color(0xffffff));
    label5.setFont(new Font("Arial", Font.BOLD, 10));
    label5.setBackground(new Color(0x162454));
    label5.setOpaque(true);
    label5.setHorizontalAlignment(JLabel.LEFT);
    label5.setBounds(20, 230, 148, 35);




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
   frame.getContentPane().setBackground(new Color(0x162454));
   frame.add(label);
   frame.add(t1);
   frame.add(t2);
   frame.add(label2);
   frame.add(t3);
   frame.add(label3);
   frame.add(t4);
   frame.add(label4);
   frame.add(t5);
   frame.add(label5);

   final Button pesa = new Button("LOAN");

   pesa.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
     int p = Integer.parseInt(t2.getText());
     int rate = Integer.parseInt(t4.getText());
    int n= Integer.parseInt(t3.getText());
    int sum = p*(1+(rate/100)^n);
     t5.setText(String.valueOf(sum));
    }
    
   });

   pesa.setBounds(60, 300git, 80, 30);
   pesa.setBackground(new Color(0x1f87fc));
   pesa.setForeground(new Color(0xffffff));
   pesa.setFont(new Font("MV BOLI", Font.BOLD, 18));
   frame.add(pesa);

    }


    }

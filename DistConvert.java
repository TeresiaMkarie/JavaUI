
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DistConvert {
    
    public static void main(String[] args){


//First textField input
   final TextField t1 = new TextField();
    t1.setBounds(88,30,140,35);
    t1.setBackground(new Color(0x162454));
    t1.setForeground(new Color(0xffffff));

  
    //First label input
    JLabel label = new JLabel();
    label.setText("KILOMETER : ");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.CENTER);
    label.setForeground(new Color(0xffffff));
    label.setFont(new Font("Arial", Font.BOLD, 10));
    label.setBackground(new Color(0x162454));
    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(20, 30, 68,35);

    //second textfield Input
   final TextField t2 = new TextField();
    t2.setBounds(88,80,140,35);
    t2.setBackground(new Color(0x162454));
    t2.setForeground(new Color(0Xffffff));
    

    //Second label input
    JLabel label2 = new JLabel();
    label2.setText("CENTI.M: ");
    label2.setHorizontalTextPosition(JLabel.CENTER);
    label2.setVerticalTextPosition(JLabel.CENTER);
    label2.setForeground(new Color(0xffffff));
    label2.setFont(new Font("Arial", Font.BOLD, 10));
    label2.setBackground(new Color(0x162454));
    label2.setOpaque(true);
    label2.setHorizontalAlignment(JLabel.CENTER);
    label2.setBounds(20, 80, 80, 35);

//Third textfield Input
    final TextField t3 = new TextField();
    t3.setBounds(88,130,140,35);
    t3.setBackground(new Color(0x162454));
    t3.setForeground(new Color(0xffffff));

    //Third label input
    JLabel label3 = new JLabel();
    label3.setText("MILES   : ");
    label3.setHorizontalTextPosition(JLabel.CENTER);
    label3.setVerticalTextPosition(JLabel.CENTER);
    label3.setForeground(new Color(0xffffff));
    label3.setFont(new Font("Arial", Font.BOLD, 10));
    label3.setBackground(new Color(0x162454));
    label3.setOpaque(true);
    label3.setHorizontalAlignment(JLabel.CENTER);
    label3.setBounds(20, 130, 80, 35);

    
  //fourth textfield Input
    final TextField t4 = new TextField();
    t4.setBounds(88,180,140,35);
    t4.setBackground(new Color(0x162454));
    t4.setForeground(new Color(0xffffff));

 
    //Fourth label input
    JLabel label4 = new JLabel();
    label4.setText("FEET");
    label4.setHorizontalTextPosition(JLabel.CENTER);
    label4.setVerticalTextPosition(JLabel.CENTER);
    label4.setForeground(new Color(0xffffff));
    label4.setFont(new Font("Arial", Font.BOLD, 10));
    label4.setBackground(new Color(0x162454));
    label4.setOpaque(true);
    label4.setHorizontalAlignment(JLabel.CENTER);
    label4.setBounds(20, 180, 80, 35);
  

  //Create a JFrame instance
   JFrame frame = new JFrame();
   frame.setTitle("Loans Detector");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Exiting out of the application
   frame.setResizable(false);
   frame.setSize(700,700);
   frame.setVisible(true);

   //creating an ImageIcon
   ImageIcon image = new ImageIcon("distance.png");
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
   
   final Button calc = new Button("CONVERT");

   calc.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){

     int kilo = Integer.parseInt(t1.getText());
     int cm = kilo*100000;
     t2.setText(String.valueOf(cm));
     double ml =kilo*0.621371;
     t3.setText(String.valueOf(ml));
     double fg = kilo*3280.84;
     t4.setText(String.valueOf(fg));
    }
   });
    calc.setBounds(60,270, 80,30);
    frame.add(calc);
}
}

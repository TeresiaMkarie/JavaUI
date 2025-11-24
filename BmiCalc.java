import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class BmiCalc {

    
public static void main(String[] args){

//An instance of a JFrame
JFrame frame = new JFrame();
frame.setTitle("BMI_CALCULATOR");
frame.setForeground(new Color(0x000000));
frame.setFont(new Font("Arial", Font.BOLD, 30));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.setSize(400,600);
frame.setLayout(null);


// Changing JFrame's ImageIcon
ImageIcon image = new ImageIcon("bmi.png");
frame.setIconImage(image.getImage());
frame.getContentPane().setBackground(new Color(0x162454));



JPanel panel = new JPanel();
panel.setBackground(new Color(0x1f87fc));
panel.setBounds(20,50,340,60);
panel.setLayout(null);
frame.add(panel);


// Add  Label in the Panel
        JLabel label = new JLabel("BODY MASS INDEXER");
        label.setFont(new Font("Segoe UI", Font.BOLD, 30));
        label.setForeground(Color.white);
        label.setBounds(20, 10, 310, 40);
        panel.add(label);



 final TextField t1 = new TextField();
    t1.setBounds(105,130,160,35);
    t1.setBackground(new Color(0x162454));
    t1.setForeground(new Color(0xffffff));
    frame.add(t1);

JLabel label1 = new JLabel();
    label1.setText("HEIGHT(M): ");
    label1.setHorizontalTextPosition(JLabel.CENTER);
    label1.setVerticalTextPosition(JLabel.CENTER);
    label1.setForeground(new Color(0xffffff));
    label1.setFont(new Font("Arial", Font.BOLD, 11));
    label1.setBackground(new Color(0x162454));
    label1.setOpaque(true);
    label1.setHorizontalAlignment(JLabel.RIGHT);
    label1.setBounds(20, 130, 70, 35);
    frame.add(label1);
  
    
    final TextField t2 = new TextField();
    t2.setBounds(105,175,160,35);
    t2.setBackground(new Color(0x162454));
    t2.setForeground(new Color(0xffffff));
    frame.add(t2);

JLabel label2 = new JLabel();
    label2.setText("WEIGHT(KGs): ");
    label2.setHorizontalTextPosition(JLabel.CENTER);
    label2.setVerticalTextPosition(JLabel.CENTER);
    label2.setForeground(new Color(0xffffff));
    label2.setFont(new Font("Arial", Font.BOLD, 11));
    label2.setBackground(new Color(0x162454));
    label2.setOpaque(true);
    label2.setHorizontalAlignment(JLabel.RIGHT);
    label2.setBounds(20, 175, 80, 35);
    frame.add(label2);
    

    final TextField t3 = new TextField();
    t3.setBounds(105,230,60,40);
    t3.setBackground(new Color(0xe0f2f1));
    t3.setForeground(new Color(0x112d4e));
    t3.setEditable(false);
    frame.add(t3);

JLabel label3 = new JLabel();
    label3.setText("BMI : ");
    label3.setHorizontalTextPosition(JLabel.CENTER);
    label3.setVerticalTextPosition(JLabel.CENTER);
    label3.setForeground(new Color(0xffffff));
    label3.setFont(new Font("Arial", Font.BOLD, 11));
    label3.setBackground(new Color(0x162454));
    label3.setOpaque(true);
    label3.setHorizontalAlignment(JLabel.CENTER);
    label3.setBounds(20, 230, 80, 35);
    frame.add(label3);
    
      
   final Button calc = new Button("CALCULATE");

   calc.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
       double hgt = Double.parseDouble(t1.getText());
       double wght = Double.parseDouble(t2.getText());
       double bmi = wght /(hgt*hgt);
        t3.setText(String.valueOf(bmi));

 //if statements to show whether one falls in which category


final Label category= new Label();
category.setFont(new Font("Segoe UI", Font.BOLD, 18));
category.setForeground(Color.white);
category.setBounds(70, 300, 350, 40);
frame.add(category);



if (bmi < 18.5) {
    category.setText("Underweight!");
} 
else if (bmi >= 18.5 && bmi <= 24.9) {
    category.setText("Normal");
}
else if (bmi >= 25 && bmi <= 29.9) {
    category.setText("Overweight!!");
}
else {
    category.setText("Obesity!!!");
}




    }

});

   calc.setBounds(175, 230, 115, 40);
   calc.setBackground(new Color(0x1f87fc));
   calc.setForeground(new Color(0xffffff));
   calc.setFont(new Font("Segoe UI", Font.BOLD, 18));
   frame.add(calc);





frame.setVisible(true);

 }

}   


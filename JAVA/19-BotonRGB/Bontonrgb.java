import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bontonrgb extends JFrame implements ActionListener{

private JLabel label1,label2,label3;
private JComboBox combo1,combo2,combo3;
private JButton boton1;

  public Bontonrgb(){
  setLayout(null);

  label1 = new JLabel("Red");
   label1.setBounds(15,15,90,30);
   add(label1);
  combo1 = new JComboBox();
   combo1.setBounds(120,15,90,30);
   for(int i = 0;i <= 225;i++){
      combo1.addItem(String.valueOf(i));}
   add(combo1);

  label2 = new JLabel("Green");
   label2.setBounds(15,50,90,30);
   add(label2);
  combo2 = new JComboBox();
   combo2.setBounds(120,50,90,30);
   for(int i = 0;i <= 225;i++){
      combo2.addItem(String.valueOf(i));}
   add(combo2);

  label3 = new JLabel("Blue");
   label3.setBounds(15,90,90,30);
   add(label3);
  combo3 = new JComboBox();
   combo3.setBounds(120,90,90,30);
   for(int i = 0;i <= 225;i++){
      combo3.addItem(String.valueOf(i));}
   add(combo3);

  boton1 = new JButton("Fijar color");
   boton1.setBounds(100,140,90,30);
   boton1.addActionListener(this);
   add(boton1);
  }
  public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    String ca1 = combo1.getSelectedItem().toString();
    String ca2 = combo2.getSelectedItem().toString();
    String ca3 = combo3.getSelectedItem().toString();
    
    int red = Integer.parseInt(ca1);
    int green = Integer.parseInt(ca2);
    int blue = Integer.parseInt(ca3);

    Color color1 = new Color(red,green,blue);
    boton1.setBackground(color1);}
  }
   public static void main(String args[]){
    Bontonrgb formulario = new Bontonrgb();
    formulario.setBounds(0,0,240,250);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
   }
}
import javax.swing.*;
import java.awt.event.*;

public class UsoComboBox extends JFrame implements ItemListener{

  JLabel label1;
  JComboBox combo1;

 public UsoComboBox(){
  setLayout(null);
  
  label1 = new JLabel("Color");
   label1.setBounds(150,80,100,30);
   add(label1);
  
  combo1 = new JComboBox();
   combo1.setBounds(15,15,90,30);
   add(combo1);
      
  combo1.addItem("Amarillo");
  combo1.addItem("Rojo");
  combo1.addItem("Azul");
  combo1.addItem("Verde");
  combo1.addItem("Blanco");
  combo1.addItem("Negro");
  combo1.addItemListener(this);
 }
  public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
   String seleccion = combo1.getSelectedItem().toString();
   setTitle(seleccion); 
   label1.setText(seleccion);} 
 }
  public static void main(String args[]){
   UsoComboBox formulario = new UsoComboBox();
   formulario.setBounds(0,0,200,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}
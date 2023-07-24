import javax.swing.*;
import java.awt.event.*;

public class RepasoComboBox extends JFrame implements ItemListener{
 
 JLabel label1;
 JComboBox combo1;

public RepasoComboBox(){
  setLayout(null);

  label1 = new JLabel("Color");
   label1.setBounds(150,90,100,30);
   add(label1);

  combo1 = new JComboBox();
   combo1.setBounds(15,15,100,30);
   combo1.addItem("Amarillo");
   combo1.addItem("Azul");
   combo1.addItem("Verde");
   combo1.addItem("Blanco");
   combo1.addItem("Negro");
   combo1.addItem("52");
   combo1.addItem("%$%");
   combo1.addItemListener(this);
   add(combo1);
  }
   public void itemStateChanged(ItemEvent e){
    if(e.getSource() == combo1){
     String seleccion = combo1.getSelectedItem().toString();
     setTitle(seleccion);
     label1.setText(seleccion);}
  }
 public static void main(String args[]){
  RepasoComboBox formulario = new RepasoComboBox();
  formulario.setBounds(0,0,200,250);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
  }
}
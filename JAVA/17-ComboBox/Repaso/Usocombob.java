import javax.swing.*;
import java.awt.event.*;

public class Usocombob extends JFrame implements ItemListener{

 private JLabel label1;
 private JComboBox combo1;

 public Usocombob(){
  setLayout(null);
  label1 = new JLabel("Color");
  label1.setBounds(150,90,100,30);
  add(label1);

  combo1 = new JComboBox();
  combo1.setBounds(15,15,100,30);
  add(combo1);
  combo1.addItem("Amarillo");
  combo1.addItem("Azul");
  combo1.addItem("Rojo");
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
  Usocombob formulario = new Usocombob();
  formulario.setBounds(0,0,300,200);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}
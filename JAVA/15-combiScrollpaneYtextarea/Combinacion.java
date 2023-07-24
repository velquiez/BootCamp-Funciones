import javax.swing.*;
import java.awt.event.*;

public class Combinacion extends JFrame implements ActionListener{
  
  private JButton boton1, boton2;
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  String texto  = "";
 
 public Combinacion(){
 setLayout(null);
//Se agrega boton
  boton1 = new JButton("Agregar");
   boton1.setBounds(190,10,100,30);
   add(boton1);
   boton1.addActionListener(this);
  boton2 = new JButton("Cerrar");
   boton2.setBounds(300,10,100,30);
   add(boton2);
   boton2.addActionListener(this);
//Se agrega barra de texto 
 textfield1 = new JTextField();
  textfield1.setBounds(10,10,150,30);
  add(textfield1);
//Se agrega area de texto y desplazamiento(scroll)
 textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(10,45,300,200);
   add(scrollpane1);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){ 
     texto += textfield1.getText() + "\n";
     textarea1.setText(texto);
     textfield1.setText("");}
   if(e.getSource() == boton2){
     System.exit(0);}
 }
 public static void main(String args[]){
  Combinacion formulario = new Combinacion();
  formulario.setBounds(0,0,410,300);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}
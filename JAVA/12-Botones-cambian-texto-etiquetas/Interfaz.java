import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

  JButton boton1, boton2, boton3,boton0;
  JLabel label1;

   public Interfaz(){
   setLayout(null);
   boton1 = new JButton("1");
    boton1.setBounds(10,250,100,30);
    add(boton1);
    boton1.addActionListener(this);
   boton2 = new JButton("2");
    boton2.setBounds(115,250,100,30);
    add(boton2);
    boton2.addActionListener(this);
   boton3 = new JButton("3");
    boton3.setBounds(215,250,100,30);
    add(boton3);
    boton3.addActionListener(this);
   boton0 = new JButton("Cerrar");
    boton0.setBounds(10,250,100,30);
    add(boton0);
    boton0.addActionListener(this);
   label1 = new JLabel("En espera...");
    label1.setBounds(10,20,200,30);
    add(label1);
   }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton0){
     System.exit(0);}
   if(e.getSource() == boton1){
     label1.setText("Ha oprimido el boton-1");}
   if(e.getSource() == boton2){
     label1.setText("Oprimiste el boton-2");}
   if(e.getSource() == boton3){
     label1.setText("El boton-3 has oprimido");}
   }
  public static void main(String args[]){
   Interfaz formulario = new Interfaz();
   formulario.setBounds(0,0,300,400);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
  }
}
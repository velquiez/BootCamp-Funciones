import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Restasinmetodo extends JFrame implements ActionListener
{
 private JLabel titulo;
 private JTextField dato1,dato2;
 private JTextArea respuesta;
 private JScrollPane scroll;
 private JButton restar;

 public Restasinmetodo()
 {
  setLayout(null);
  getContentPane().setBackground(new Color(0,0,0));
  
  titulo = new JLabel("RESTAR UTILIZANDO SUMA");
   titulo.setBounds(10,10,250,30);
   titulo.setFont(new Font("Comic Sans MS",2,16));
   titulo.setForeground(new Color(255,255,255));
   add(titulo);

   dato1 = new JTextField();
    dato1.setBounds(30,45,100,30);
    add(dato1);

   dato2 = new JTextField();
    dato2.setBounds(160,45,100,30);
    add(dato2);

   respuesta = new JTextArea();
    respuesta.setFont(new Font("Arial",1,20));
    scroll = new JScrollPane(respuesta);
    scroll.setBounds(40,100,200,40);
    add(scroll);

   restar = new JButton("Restar");
    restar.setBounds(90,150,100,30);
    restar.addActionListener(this);
    add(restar);
 }
  public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == restar)
   { 
    int rango = 0;
    int n = 0;
    int num1 = 0;
    int num2 = 0;

     String n1 = String.valueOf(dato1.getText());
     String n2 = String.valueOf(dato2.getText());

     num1 = Integer.parseInt(n1);
     num2 = Integer.parseInt(n2);

     if(num1 < num2)
       {
        rango = num2;
        n = num1;
       }
      else
          {rango = num1;
           n = num2;
          }
     
     int contador = 0;
     int respues = 0;

     for(int i = 0;i < rango;i++)
     {
      if(contador < n)
        {
         contador = contador + 1;    
        }
       else{        
            respues = respues + 1;
           } 
      }
        if(num1 < num2)
       {
        respuesta.setText("\n         -"+ respues);
       }
      else{
           respuesta.setText("\n         "+ respues);
          }
    }

   
 }
  public static void main(String args[])
 {
  Restasinmetodo formulario = new Restasinmetodo();
   formulario.setBounds(0,0,300,230);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}
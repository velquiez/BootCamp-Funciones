import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Redondear extends JFrame implements ActionListener
{
 private JLabel titulo;
 private JTextField textfield1;
 private JButton redondea, cerrar;
 private JTextArea textarea;
 private JScrollPane scrollpane;
 
 public Redondear()
 {
  setLayout(null);
  getContentPane().setBackground(new Color(255,255,255));
  
  titulo = new JLabel("Redondeos sin metodos - usar punto");
   titulo.setBounds(35,10,230,30);
   add(titulo);

  textfield1 = new JTextField();
   textfield1.setBounds(35,50,200,30);
   add(textfield1);

  redondea = new JButton("Redondear");
   redondea.setBounds(50,170,100,30);
   redondea.addActionListener(this);
   add(redondea);
 
  cerrar = new JButton("Cerrar");
   cerrar.setBounds(175,170,85,30);
   cerrar.addActionListener(this);
   add(cerrar);

  textarea = new JTextArea();
   textarea.setForeground(new Color(234,0,0));
   textarea.setFont(new Font("Arial",1,16));
   scrollpane = new JScrollPane(textarea);
   scrollpane.setBounds(13,90,250,50);
   add(scrollpane);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == redondea)
    {
     double num = 0;
     double num2 = 0;
     double redondeo = 0;
     String n = "";
     String recorte1 = "";
     String recorte2 = "";
     int contador = 0;
     int cantcarac = 0;
     int c = 1;
     String w = ",";
     String t = ".";
     double decimal = 0.5;
     double respuesta = 0;
               
     n = String.valueOf(textfield1.getText());
     cantcarac = n.length();
    
     for(int i = 0; i < cantcarac;i++)
        {
         recorte1 = n.substring(i,c);
         c = c + 1;
         
         if(recorte1.equals(w))
                             {                            
                              i = cantcarac + 1;                          
                             }
         else if(recorte1.equals(t))
                             {                            
                              i = cantcarac + 1;                          
                             }
         else
             {contador = contador + 1;}
        }
         recorte2 = n.substring(0,contador);

       num = Double.valueOf(n);
       num2 = Double.valueOf(recorte2);

       redondeo = (num-num2);
             
       if(redondeo >= decimal)
                              { respuesta = (num2 + 1);}
       else
           {respuesta = num2;}
         
      textarea.setText("\n         >>> " + respuesta + " <<< "); 

    }
  if(e.getSource() == cerrar)
    {
     System.exit(0);
    }
 }
 public static void main(String args[])
 {
  Redondear formulario = new Redondear();
   formulario.setBounds(0,0,300,250);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}
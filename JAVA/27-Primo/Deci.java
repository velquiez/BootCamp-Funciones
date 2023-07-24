import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Deci extends JFrame implements ActionListener
{
 private JTextField text1;
 private JButton boton1;
 private JLabel label1;

 public Deci()
 {
     setLayout(null);
  label1 = new JLabel("En espera... ");
   label1.setBounds(30,20,250,30);
   add(label1);

  text1 = new JTextField();
   text1.setBounds(40,60,150,30);
   add(text1);

  boton1 = new JButton("Identificar");
   boton1.setBounds(40,100,150,30);
   boton1.addActionListener(this);
   add(boton1);
 }
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == boton1)
     {
      String numero = text1.getText();
      String cad = String.valueOf(numero);
      int cantidad = cad.length();
 
      int c = 0;
      int a = 1;
      String d = ",";
      String h = ".";
 
      for(int i = 0; i < cantidad; i++)
          {
           String recorte = cad.substring(i,a);   

            if(recorte.equals(d))
                          {c = c + 1;}
            if(recorte.equals(h))
                          {c = c + 1;}  
              a = a + 1;
          }
      if(c == 1){label1.setText("El numero tiene decimales");}
        else{label1.setText("El numero no tiene decimales");}
  }
    }
    public static void main(String args[]){
    Deci formulario = new Deci();
     formulario.setBounds(0,0,300,230);
     formulario.setVisible(true);
     formulario.setResizable(false);
     formulario.setLocationRelativeTo(null);
    }
}
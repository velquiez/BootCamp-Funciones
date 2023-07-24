import javax.swing.*;
import java.awt.event.*;


public class Deci extends JFrame implements ActionListener
{
 private JTextField text1;
 private JButton boton1;
 private JLabel label1;

 public Deci()
 {
  setLayout(null);
  setTitle("Identificar si numero tiene Decimales");
  getContentPane().setBackground(new Color(0,45,53));

  label1 = new JLabel("En espera... ");
   label1.setBounds(30,20,250,30);
   label1.setFont(new Font("Arial",2,18));
   label1.setForeground(new Color (255,255,255));
   add(label1);

  text1 = new JTextField();
   text1.setBounds(40,60,150,30);
   text1.setForeground(new Color(255,0,0));
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

      if(c == 1)
             {label1.setText("El numero tiene decimales");}
      else
            {label1.setText("El numero NO tiene decimales");}
   }
  }
    public static void main(String args[])
     {
      Deci formulario1 = new Deci();
      formulario1.setBounds(0,0,300,230);
      formulario1.setVisible(true);
      formulario1.setLocationRelativeTo(null);
      formulario1.setResizable(false);
  }
}
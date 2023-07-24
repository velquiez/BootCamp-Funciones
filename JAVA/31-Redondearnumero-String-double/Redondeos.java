import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Redondeos extends JFrame implements ActionListener
{
 private JTextField textfield;
 private JLabel titulo, ingrese, floor, ceil, round;
 private JButton redondear, cerrar;
 
 public Redondeos()
 {
  setLayout(null);
   setTitle("Metodos para redondeos");
   getContentPane().setBackground(new Color(0,200,0));

  titulo = new JLabel("Metodos para aplicar redondeos");
   titulo.setBounds(25,10,200,30);
   add(titulo);

  ingrese = new JLabel("Ingrese numero - utilizar punto: ");
   ingrese.setBounds(40,50,200,30);
   add(ingrese);

  textfield = new JTextField();
   textfield.setBounds(40,75,150,30);
   add(textfield);

  floor = new JLabel("rf = Math.floor(num): ");
   floor.setBounds(15,120,200,30);
   add(floor);

  ceil = new JLabel("rc = Math.ceil(num): ");
   ceil.setBounds(15,155,200,30);
   add(ceil);

  round = new JLabel("rr = Math.round(num): ");
   round.setBounds(15,185,200,30);
   add(round);
  
  redondear = new JButton("Calcular");
   redondear.setBounds(45,220,100,30);
   redondear.addActionListener(this);
   add(redondear);
 
  cerrar = new JButton("Cerrar");
   cerrar.setBounds(45,260,100,30);
   cerrar.addActionListener(this);
   add(cerrar);  
 } 
  public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == redondear)
    {
         double num = 0;
 	 double rr = 0;
	 double rc = 0;
	 double rf = 0; 
     
   String cad = String.valueOf(textfield.getText()); 
   num = Double.parseDouble(cad);

     rr = Math.round(num);
     rc = Math.ceil(num);
     rf = Math.floor(num);

     floor.setText("rf = Math.floor(num): " + rf);
     ceil.setText("rc = Math.ceil(num): " + rc);
     round.setText("rr = Math.round(num): " + rr);
    }
   if(e.getSource() == cerrar)
   {
   System.exit(0);
   }
 }
 public static void main(String args[])
 {
  Redondeos formulario = new Redondeos();
   formulario.setBounds(0,0,300,400);
   formulario.setVisible(true);
   formulario.setResizable(true);
   formulario.setLocationRelativeTo(null);
 }
}
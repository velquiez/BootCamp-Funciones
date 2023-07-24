import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Radiobutton extends JFrame implements ChangeListener, ActionListener
{
 private JButton cerrar;
 private ButtonGroup bg;
 private JRadioButton radio1,radio2,radio3;

 public Radiobutton()
 {
  setLayout(null);

  bg = new ButtonGroup();

  radio1 = new JRadioButton("280*180");
   radio1.setBounds(10,10, 150,30);
   radio1.addChangeListener(this);
   add(radio1);
   bg.add(radio1);
  
  radio2 = new JRadioButton("700*500");
   radio2.setBounds(10,60,150,30);
   radio2.addChangeListener(this);
   add(radio2);
   bg.add(radio2);
   
   radio3 = new JRadioButton("1200*780");
    radio3.setBounds(10,90,150,30);
    radio3.addChangeListener(this);
    add(radio3);
    bg.add(radio3);

   cerrar = new JButton("Cerrar");
    cerrar.setBounds(60,140,100,30);
    cerrar.addActionListener(this);
    add(cerrar);
 }
 
 public void stateChanged(ChangeEvent e)
 {
  if(radio1.isSelected())
    {
     setSize(280,180);
    }
  if(radio2.isSelected());
    {
     setSize(700,500);
    }
  if(radio3.isSelected())
    {
     setSize(1200,780);
    }
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == cerrar)
    {
     System.exit(0);
    }
 }

  public static void main(String args[])
 {
  Radiobutton formulario = new Radiobutton();
   formulario.setBounds(0,0,280,180);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}
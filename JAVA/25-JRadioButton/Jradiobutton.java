import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Jradiobutton extends JFrame implements ActionListener, ChangeListener 
{
   private JRadioButton rboton1, rboton2, rboton3;
   private ButtonGroup bg;
   private JButton cerrar;

 public Jradiobutton()
 {
  setLayout(null);
  
  bg = new ButtonGroup();
  
  rboton1 = new JRadioButton("400*280");
   rboton1.setBounds(10,15,100,30);
   rboton1.addChangeListener(this);
   add(rboton1);
   bg.add(rboton1);

  rboton2 = new JRadioButton("800*600");
   rboton2.setBounds(10,50,100,30);
   rboton2.addChangeListener(this);
   add(rboton2);
   bg.add(rboton2);

  rboton3 = new JRadioButton("1024*768");
   rboton3.setBounds(10,90,100,30);
   rboton3.addChangeListener(this);
   add(rboton3);
   bg.add(rboton3);  

  cerrar = new JButton("Cerrar");
   cerrar.setBounds(60,120,100,30);
   cerrar.addActionListener(this);
   add(cerrar);
 }
  public void stateChanged(ChangeEvent e)
   {
    if(rboton1.isSelected()){
      setSize(400,280);
    }
    if(rboton2.isSelected()){
      setSize(800,600);
    }
    if(rboton3.isSelected()){
      setSize(1024,768);
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
   Jradiobutton formulario = new Jradiobutton();
    formulario.setBounds(0,0,400,280);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
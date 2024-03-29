import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Aceptarterminos extends JFrame implements ChangeListener, ActionListener
{
 private JButton cerrar;
 private JCheckBox check1;
 private JLabel label1;

 public Aceptarterminos()
 {
  setLayout(null);

  label1 = new JLabel("Aceptar terminos y condiciones");
   label1.setBounds(45,20,230,30);
    add(label1);
  
  check1 = new JCheckBox("Aceptar terminos");
   check1.setBounds(70,70,150,30);
    check1.addChangeListener(this);
    add(check1);
  
  cerrar = new JButton("Cerrar");
   cerrar.setBounds(90,150,100,30);
    cerrar.addActionListener(this);
     add(cerrar);
 }
  public void stateChanged(ChangeEvent c)
   {
   if(check1.isSelected() == true)
     {
      cerrar.setEnabled(true);
     }
   else
     {
      cerrar.setEnabled(false);
     }
   }
  public void actionPerformed(ActionEvent e)
   {
    if(e.getSource() == cerrar)
      {
       System.exit(0);
      }
    }
 public static void main(String [] args)
  {
   Aceptarterminos formulario = new Aceptarterminos();
   formulario.setBounds(0,0,300,240);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
  }
}